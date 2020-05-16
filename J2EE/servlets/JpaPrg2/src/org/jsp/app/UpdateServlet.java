package org.jsp.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException 
 {
	String festName1=req.getParameter("fn3");
	String festDT=req.getParameter("fd3");
	
	Festival festival1=new Festival();
	festival1.setFestivalName(festName1);
	festival1.setFestivalDate(festDT);
	
	JPACode.updateFestival(festival1);
}
}
