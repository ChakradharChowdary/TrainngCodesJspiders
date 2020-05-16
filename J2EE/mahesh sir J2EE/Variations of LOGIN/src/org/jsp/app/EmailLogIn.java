package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmailLogIn
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=97051";
		String query1="select * from test.registrationprocess where emailid=?";
		String query2="select Name from test.registrationprocess where password=?";
		
		Scanner scanner=new Scanner(System.in);
		try
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Connection established");
			
			PreparedStatement preparedStatement=connection.prepareStatement(query1);
			
			System.out.println("Platform");
			
			
			System.out.println("Enter emailid");
			preparedStatement.setString(1,scanner.next());
			
		
			ResultSet r1=preparedStatement.executeQuery();
			
			if(r1.next())
			{
				PreparedStatement ps=connection.prepareStatement(query2);
				System.out.println("enterpass");
				ps.setString(1, scanner.next());
				ResultSet r2=ps.executeQuery();
				
				
				
				if(r2.next())
				{
				
					String name=r2.getString("Name");
					System.out.println("welcome" +name);
				}
				else{System.err.println("enter correct pass");
			}
			}
			else {System.err.println("invalid emailid");
			
			}
		}
		catch (SQLException e) 
		{

			e.printStackTrace();
		}
		

	}
}
