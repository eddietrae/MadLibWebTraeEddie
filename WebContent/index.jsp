<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mad Lib</title>
<script type = "text/javascript">
	function validate(){
		if( document.myform.verb.value == ""){
			alert("Please enter verb!");
			document.myform.verb.focus();
			return false;
		}
		if( document.myform.noun.value == ""){
			alert("Please enter noun!");
			document.myform.noun.focus();
			return false;
		}
		if( document.myform.adjective.value == ""){
			alert("Please enter adjective!");
			document.myform.adjective.focus();
			return false;
		}
		if( document.myform.place.value == ""){
			alert("Please enter place!");
			document.myform.place.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<h1>Lets do a Mad Lib!</h1>
	<form name="myform" action="getWordsServlet" method="post" onsubmit="return(validate());">
		<label for="verb">Enter a past tense verb:</label><input type="text"name="verb"size="10"><br>
		<label for="noun">Enter a noun:</label><input type="text"name="noun"size="10"><br>
		<label for="adjective">Enter an adjective:</label><input type="text"name="adjective"size="10"><br>
		<label for="place">Enter a place:</label><input type="text"name="place"size="10"><br>
		<input type="submit"value="Run Mad"/>
	</form>
	<a href="upperForm.jsp">Do an UPPERCASE MAD LIB</a>
</body>
</html>