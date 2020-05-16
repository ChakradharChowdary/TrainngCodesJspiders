package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ChangePhonenum 
{
	 public static void main(String[] args) 
	  {
		  String a =null;
		  String b=null;
		  
		String url="jdbc:mysql://localhost:3306?user=root&password=97051";
		String query="update test.registrationprocess set PhoneNum=? where PhoneNum=?";
		
		Scanner scanner=new Scanner(System.in);
		try
		{
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Connection established");
			
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			System.out.println("Platform");
			
			
			System.out.println("Enter new phone number");
			preparedStatement.setString(1,scanner.next());
			
			System.out.println(" enter old Phone Number");
			preparedStatement.setString(2,scanner.next());
			int res=preparedStatement.executeUpdate();
			System.out.println("No of Rows Effected" +res);
			System.out.println("Updated sucessfull");
			
		}
		catch (SQLException e) 
		{

			e.printStackTrace();
		}
		
	}
}
