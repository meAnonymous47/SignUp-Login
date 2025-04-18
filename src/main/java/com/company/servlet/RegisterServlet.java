package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.company.dao.UserDao;
import com.company.dao.UserDaoImp;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImp();
       
    public RegisterServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Register success");
		
		String UserId = new String();
		String Email = new String();
		String Password = new String();
		
		UserId = request.getParameter("username");
		Email = request.getParameter("email");
		Password = request.getParameter("password");
		
		boolean UserAdded = userDao.add(UserId,Email,Password);
		if(UserAdded) {
			response.sendRedirect("login.jsp?userAdded=1");
		}else {
			response.sendRedirect("register.jsp?error=1");
		}
		
		
		
		
	}

}
