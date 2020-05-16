package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PStatement 
{
	 public static void main(String[] args) {
			String url="jdbc:mysql://localhost:3306?user=root&password=97051";
			String query="insert into test.employee values(?,?,?)";
			
			
			try
			{
				Connection connection=DriverManager.getConnection(url);
				System.out.println("step 1");
			   
				PreparedStatement preparedStatement=connection.prepareStatement(query);
			   System.out.println("step 2");
			   
			   Scanner scanner=new Scanner(System.in);
			   
			   System.out.println("Enter EmpId");
			   preparedStatement.setInt(1, scanner.nextInt());
			   
			   System.out.println("Enter EmpRole");
			   preparedStatement.setString(2,scanner.next());
			   
			   System.out.println("Enter EmpName");
			   preparedStatement.setString(3,scanner.next());
			    
			   preparedStatement.executeUpdate();
			   System.out.println("step 3");
			} 
			catch (SQLException e) 
			{
			
				e.printStackTrace();
			}
			
		}
}
