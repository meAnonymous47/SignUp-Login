<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="register.css">
</head>
<body>
	
	<div class="Register-container">
		<h2>Register</h2>
			
		<form action="RegisterServlet" method="post">
			<label for="Username">Username:</label>
			<input type="text" class="UserId" name="username" placeholder="Enter Your User-Id" required>

			<label for="Email">Email:</label>
			<input type="email" class="EmailId" name="email" placeholder="Enter Your Email-Id" required> 

			<label for="Password"> Password: </label>
			<input type="password" class="Pass" name="password" placeholder="Enter Your Password" required>

			<button type="submit">Register</button>
		</form>
		
		<p><a href="index.html">Back to Home</a></p>
		
 
		 <% String error = request.getParameter("error");
		if(error != null && error.equals("1")){
		 %>
			<p style="color: red;">Error Occurred, Please Try Again.</p>
		 <% } %>
		
		
	</div>

</body>
</html>
