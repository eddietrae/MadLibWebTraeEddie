package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLib;

/**
 * Servlet implementation class getWordsServlet
 */
@WebServlet("/getWordsServlet")
public class getWordsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWordsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String verb= request.getParameter("verb");
		String noun= request.getParameter("noun");
		String adj= request.getParameter("adjective");
		String place= request.getParameter("place");
		
		MadLib mad = new MadLib(verb,noun,adj,place);
		mad.setToLower();
		request.setAttribute("mad", mad);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
