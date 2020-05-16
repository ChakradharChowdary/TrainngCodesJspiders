package org.jsp.app;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CombineServlets")
public class CombineServlets extends HttpServlet
{

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException 
{
     String festName=req.getParameter("fn");
     String festDate=req.getParameter("fd");
     String festType=req.getParameter("ft");
     
     
     Festival festival=new Festival();
     festival.setFestivalName(festName);
     festival.setFestivalDate(festDate);
     festival.setFestivalType(festType);
     
     JPACode.saveFestival(festival);
     

}

}
