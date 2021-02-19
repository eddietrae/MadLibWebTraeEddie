<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MAD LIB RESULT</title>
</head>
<body>
	<p>A ${mad.getNoun()} ${mad.getVerb()} to the ${mad.getAdjective()} ${mad.getPlace()}</p>
	<a href="index.jsp">Change your words!</a>
</body>
</html>