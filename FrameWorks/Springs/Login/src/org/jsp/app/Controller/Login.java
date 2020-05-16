package org.jsp.app.Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/View/Login")
public class Login extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException
	{
	  String name=req.getParameter("nm");
	  String email=req.getParameter("em");
	  String pw=req.getParameter("pw");
	}

}
