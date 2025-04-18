<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>

<%	
	HttpSession currSession = request.getSession(false);
	if(currSession != null){
		currSession.invalidate();
		response.sendRedirect("login.jsp?logout=1");
	}
    
%>
   

	

</body>
</html>
