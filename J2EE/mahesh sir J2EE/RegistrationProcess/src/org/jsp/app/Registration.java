package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration
{
  public static void main(String[] args) 
  {
	  String a =null;
	  String b=null;
	  
	String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	String query="insert into test.registrationprocess values(?,?,?,?)";
	
	Scanner scanner=new Scanner(System.in);
	try
	{
		Connection connection=DriverManager.getConnection(url);
		System.out.println("Connection established");
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		System.out.println("Platform");
		
		
		System.out.println("Enter Name");
		preparedStatement.setString(1,scanner.next());
		
		System.out.println("Phone Number");
		preparedStatement.setString(2,scanner.next());
		
		System.out.println("Enter Email Id");
		preparedStatement.setString(3,scanner.next());
		
		System.out.println("Enter Password");
		a=scanner.next();
		
		System.out.println("Confirm Password");
		b=scanner.next();
		try
		{
		if(a.equals(b))
		{
			preparedStatement.setString(4,a);
		}
		else
		{
			throw new PasswordMissmatchException();
		}
		int res=preparedStatement.executeUpdate();
		System.out.println("No of Rows Effected" +res);
		System.out.println("registration sucessfull");
		}
		catch(PasswordMissmatchException rv)
		{
			System.out.println("Password not matched");
			System.out.println("enter password aagain");
		}
	}
	catch (SQLException e) 
	{

		e.printStackTrace();
	}
	}
}
