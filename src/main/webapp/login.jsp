<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	
	<div class="Login-container">
		<h2>Login</h2>
			
		<form action="LoginServlet" method="post">
			<label for="Username">Username:</label>
			<input type="text" class="UserId" name="username" placeholder="Enter Your UserId" required>
			<label for="Password"> Password: </label>
			<input type="password" class="Pass" name="password" placeholder="Enter Your Password" required>
			<button type="submit">Login</button>
		</form>
		
		<p> <a href="index.html"> Back to Home</a> </p>
		
		<% String error = request.getParameter("error");
		if(error != null && error.equals("1")){
		 %>
			<p style="color: red;">Invalid Username or Password</p>
		 <% } %>
		 
		 <% String logout = request.getParameter("logout");
		if(logout != null && logout.equals("1")){
		 %>
			<p style="color: green;">Logged Out Successfully</p>
		 <% } %>
		 
		 <% String userAdded = request.getParameter("userAdded");
		if(userAdded != null && userAdded.equals("1")){
		 %>
			<p style="color: green;">Registration Successfull. Please Login</p>
		 <% } %>
			
	</div>


</body>
</html>