package org.jsp.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RemoveServlet extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException 
 {
	String festName2=req.getParameter("fn2");
	Festival festival2=new Festival();
	
	festival2.setFestivalName(festName2);
	
}
}
