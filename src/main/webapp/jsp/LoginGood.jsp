<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login Accepted! </h1>
	<br>
	<b>Welcome, ${customer.firstName}</b>
	<br><br>
	
	<form method="POST" action="logout">
		<h1></h1>
		<input type = "submit" value = "Logout"/>
	</form>			
</body>
</html>