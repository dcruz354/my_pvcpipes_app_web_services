<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Application</title>
</head>
<body>
	<h1>Log into the Application</h1>
	<p>Please fill in all the fields below and click the submit button!</p>
	<form method="POST" action="login">
		1. User's Name: <input type="text" name="usersLoginName"/> <br/>
		2. User's Password: <input type="text" name="usersLoginPassword"/> <br/>
		<br>${message}
		<br><br>		
	<h1></h1>
	<input type = "submit" value = "Submit"/>
	</form>
</body>
</html>