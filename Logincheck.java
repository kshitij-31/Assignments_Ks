package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logincheck
 */
@WebServlet("/Logincheck")
public class Logincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logincheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");


		// TODO Auto-generated method stub
		//response.setContentType("text/html");
//		String uname=request.getParameter("txtUname");
//		String pword=request.getParameter("txtPassword");
//		PrintWriter out=response.getWriter();
//		if(uname.equalsIgnoreCase("Kshitij") && pword.equals("Ks1234")){
//			out.println("You are Welcome");
//		}
//		else
//			out.println("Invalid Username or Password");
//		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");


		// TODO Auto-generated method stub
		//response.setContentType("text/html");
		String uname=request.getParameter("txtUname");
		String pword=request.getParameter("txtPassword");
		PrintWriter out=response.getWriter();
		
		RequestDispatcher rd;
		if(uname.equalsIgnoreCase("Kshitij") && pword.equals("Ks1234")){
			HttpSession session =request.getSession(true);
			session.setAttribute("username", uname);
			
			rd=request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		}
		else {
			out.println("Invalid Username or Password");
			rd=request.getRequestDispatcher("Login1.html");
			rd.include(request, response);
			
		}
		
		
	}

}
