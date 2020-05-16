package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultantData
{
 public static void main(String[] args) 
 {
	String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	  String query="select * from test.employee";
		try 
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("step 1");
			Statement statement=connection.createStatement();
			System.out.println("step 2");
			ResultSet resultSet=statement.executeQuery(query);
			System.out.println("step 3");
			for(int i=1;i<=10;i++)
			{
				resultSet.next();
				if(i%2==1)
				{
				
		int id=resultSet.getInt("empId");
		String role=resultSet.getString("empRole");
		String name=resultSet.getString("empName");
		
			System.out.println(id+" "+role+" "+name);
				}
			}
			System.out.println("step 4");
			connection.close();
			System.out.println("step 5");
		}
		 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
 }
} 