

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLib;

/**
 * Servlet implementation class getWORDSServlet
 */
@WebServlet("/getWORDSServlet")
public class getWORDSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWORDSServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		mad.setToUpper();
		
		request.setAttribute("mad", mad);
		getServletContext().getRequestDispatcher("/resultUpper.jsp").forward(request, response);
	}

}
