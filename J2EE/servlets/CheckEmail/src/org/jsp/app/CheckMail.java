package org.jsp.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/CheckMail")
public class CheckMail extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String mail=req.getParameter("md");
	String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	String query="select * from test.checkid where Email=?";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url);
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1,mail);
		ResultSet  resultSet=preparedStatement.executeQuery();
		if(resultSet.next())
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("password.html");
			dispatcher.include(req,resp);
		}
		else
		{
			RequestDispatcher dispatcher=req.getRequestDispatcher("email.html");
			dispatcher.include(req,resp);
		}
	} 
	catch (SQLException e)
	{
	
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
