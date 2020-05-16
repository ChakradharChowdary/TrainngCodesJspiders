package org.jsp.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.jsp.app.Model.EmailLogin;
@WebServlet("/View/Login")
public class Login extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		   String name=req.getParameter("nm");
		   String email=req.getParameter("em");
		  String pw=req.getParameter("pas");
		  
		
		 
		  EmailLogin.run(name,email, pw);
		  PrintWriter  printWriter=resp.getWriter();
		  printWriter.println("Name="+name+"Email="+email+"Password+"+pw);
		  
	}

}
