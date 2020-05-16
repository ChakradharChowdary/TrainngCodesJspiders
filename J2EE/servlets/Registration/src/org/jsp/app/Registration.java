package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Registration")
public class Registration extends GenericServlet
{

	String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	String query="insert into test.registrationprocess values(?,?,?,?)";
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String name=req.getParameter("id1");
		String phone=req.getParameter("id2");
		String email=req.getParameter("id3");
		String password=req.getParameter("id4");
		try 
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1,name);
			preparedStatement.setString(2,phone);
			preparedStatement.setString(3,email);
			preparedStatement.setString(4,password);
			preparedStatement.executeUpdate();
			
			
			PrintWriter printWriter=resp.getWriter();
			printWriter.println("Name is: "+name+"PhoneNum is: "+phone+"EMailid : "+email+"password :"+password);
		} 
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		
		
	}

}
