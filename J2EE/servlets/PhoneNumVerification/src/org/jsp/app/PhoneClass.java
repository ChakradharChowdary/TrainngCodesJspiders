package org.jsp.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/PhoneClass")
public class PhoneClass extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException 
{
	String phone=req.getParameter("ph");
	String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	String query="select * from test.registration where MobileNo=?";
	
	try {
		Class.forName("com.jdbc.mysql.Driver");
		Connection connection=DriverManager.getConnection(url);
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, phone);
	  ResultSet resultSet=preparedStatement.executeQuery();
	  if(resultSet.next())
	  {
		  RequestDispatcher dispatcher=req.getRequestDispatcher("atm.html");
		  dispatcher.include(req, resp);
	  }
	  else
	  {
		  RequestDispatcher dispatcher=req.getRequestDispatcher("phone.html");
		  dispatcher.include(req, resp);  
	  }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
}
