package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EvenFeedBack 
{
	public static void main(String[] args)
	{
		
	
	String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	  String query="select * from test.feedback";
	  
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("step 1");
			Statement statement=connection.createStatement();
			System.out.println("step 2");
			ResultSet resultSet=statement.executeQuery(query);
			System.out.println("step 3");
			
			for(int sno=1;sno<=10;sno++)
			{
				resultSet.next();
				if(sno%2==0)
				{
	    String name=resultSet.getString("institutename");
		String course=resultSet.getString("course");
		int id=resultSet.getInt("studentidnum");
		String feedback=resultSet.getString("feedback");
		
			System.out.println(name+" "+course+" "+id+" "+feedback);
				}
				}
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
}
		
}
