package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FacebookLogIn 
{
 public static void main(String[] args) 
 {
  String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	String query1="select Name from test.registrationprocess where (EmailId=? || PhoneNum=?) and Password=?";
	String query2="select name from  test.registrationprocess where ";
	Scanner scanner=new Scanner(System.in);
	try
	{
		Connection connection=DriverManager.getConnection(url);
		System.out.println("Connection established");
		
		PreparedStatement preparedStatement=connection.prepareStatement(query1);
		
		System.out.println("Platform");
		
		System.out.println("Enter emailid Or PhoneNum");
	preparedStatement.setString((1|2) ,scanner.next());
		
		System.out.println("Enter Password");
		preparedStatement.setString(3,scanner.next());
		
		ResultSet resultSet=preparedStatement.executeQuery();
		System.out.println("step 3");
		if(resultSet.next())
		{
		 String name =resultSet.getString("Name");
		 System.out.println("Welcome" +name);
		}
		else
		{
			System.err.println("Invalid LogIn");
		}
		System.out.println("step 4");
		
		connection.close();
		System.out.println("Step 5");
	
	
	}
	catch (SQLException e) 
	{

		e.printStackTrace();
	}
 }
}
