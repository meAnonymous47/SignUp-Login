package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.company.dao.UserDaoImp;
import com.company.dao.UserDao;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Login success");
		String UserId = request.getParameter("username");
		String Password = request.getParameter("password");
		
		if(userDao.isValidUser(UserId,Password)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", UserId);
//			System.out.print("Valid User ;)");
			response.sendRedirect("welcome.jsp");
		}else {
			response.sendRedirect("login.jsp?error=1");
		}
		
	}

}
