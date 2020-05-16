package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Demo")
public class Demo extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
	  Date date=new Date();
	  System.out.println(date);
		
	  
	  PrintWriter printWriter=resp.getWriter();
		printWriter.println();
	}

}
  