package org.jsp.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ReadServlet")
public class ReadServlet extends HttpServlet
{


@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
{
 String fname1=req.getParameter("fn1");
 Festival festival2=new Festival();
 festival2.setFestivalName(fname1);
 
 JPACode.readFestival(festival2);
 
}
}
