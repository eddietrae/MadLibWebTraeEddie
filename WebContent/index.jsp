<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mad Lib</title>
</head>
<body>
	<h1>Lets do a Mad Lib!</h1>
	<form action="getWordsServlet"method="post">
		<label for="verb">Enter a verb:</label><input type="text"name="verb"size="10"><br>
		<label for="noun">Enter a noun:</label><input type="text"name="noun"size="10"><br>
		<label for="adjective">Enter an adjective:</label><input type="text"name="adjective"size="10"><br>
		<label for="place">Enter a place:</label><input type="text"name="place"size="10"><br>
		<input type="submit"value="Run Mad"/>
	</form>
</body>
</html>