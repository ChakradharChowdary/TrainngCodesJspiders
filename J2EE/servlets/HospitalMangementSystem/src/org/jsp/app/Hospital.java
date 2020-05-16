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
@WebServlet("/Hospital")
public class Hospital extends GenericServlet
{
	
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException 
	{
		
		String patienct=req.getParameter("id1");
		String disease=req.getParameter("id2");
		String doctor=req.getParameter("id3");
		String url="jdbc:mysql://localhost:3306?user=root&password=97051";
		String query="insert into test.hospital values(?,?,?)";
		try 
		{
				Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1,patienct);
			preparedStatement.setString(2,disease);
			preparedStatement.setString(3,doctor);
			preparedStatement.executeUpdate();
			PrintWriter printWriter=resp.getWriter();
			printWriter.println("PatienctName: "+patienct+"Disease: "+disease+"DoctorName: "+doctor);
			connection.close();
			
		} 
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
