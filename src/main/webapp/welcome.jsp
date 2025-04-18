<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <link rel="stylesheet" href="welcome.css">
</head>
<body>

<%	
	HttpSession newsession = request.getSession(false);

    if (newsession != null && newsession.getAttribute("username") != null ) {
    	String Username = (String) newsession.getAttribute("username");
   %>
   
   <div class="welcome-container">
        <h1>Welcome, <%= Username %> 👋</h1>
        <p>You have successfully logged in.</p>

        <div class="links">
            <a href="index.html">🏠 Back to Home</a>
            <a href="logout.jsp">🚪 Logout</a>
        </div>
    </div>
 <%
    }else{
 		response.sendRedirect("login.jsp"); // redirect if not logged in
        return;
 	}
 %>  
   

	

</body>
</html>
