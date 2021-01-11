<!-- //Almicke Navarro 
//CST-323
//January 10, 2020 
//This is my own work.

//Login will act as the form for players to input their credentials -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Login</title>
</head>
<body>
<div class="container text-center">
	<h2>Login</h2>
	<p>There are currently errors with the form & its model attribute</p>
	<!--  FIX THE ERRORS WITH THE ATTRIBUTE -->
<!-- 	<form:form method= "POST" modelAttribute="player" action="loginSuccess">
		<table> 
			<tr>
				<td><form:label path="name">Name:</form:label></td>
				<td><form:input placeholder="Enter Name" path="name"/></td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password placeholder="Enter Password" path="password"/></td>
			</tr>
			<tr>
				<td colspan="2"> 
					<input type = "submit" value = "Submit"/>
				</td>
			</table>

		<font color="red"><form:errors path="*"/></font>
	</form:form> -->

</div>
</body>
</html>