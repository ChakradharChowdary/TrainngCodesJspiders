package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/CurrencyConverter")
public class CurrencyConverter extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String num=req.getParameter("c1");
		int a=70;
		int n=Integer.parseInt(num);
		double res=n/a;
       PrintWriter printWriter=resp.getWriter();
       printWriter.println("$ ="+res);

	}

}
