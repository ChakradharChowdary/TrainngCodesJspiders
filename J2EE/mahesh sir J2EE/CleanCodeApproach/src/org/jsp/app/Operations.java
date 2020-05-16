package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Operations 
{

public static void registartion()
{
	String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	String query="insert into test.registrationprocess values(?,?,?,?)";
	try
	{
		Connection connection=DriverManager.getConnection(url);
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		System.out.println("enter name");
		Scanner scanner=new Scanner(System.in);
		preparedStatement.setString(1,scanner.next());
		System.out.println("enter phoneNum");
		preparedStatement.setString(2, scanner.next());
		System.out.println("enter emailId");
		preparedStatement.setString(3, scanner.next());
		String password=null;
            do
               {
                System.out.println("enter password");
		String a=scanner.next();
		System.out.println("confirm password");
		String b=scanner.next();
               password=a.equals(b)?a:null;
                
                }while(password==null);
		 preparedStatement.setString(4,password );
		int res=preparedStatement.executeUpdate();
		System.out.println("no of rows effected" +res);
		
		connection.close();
		
	}

	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void login()
{
	Scanner scanner=new Scanner(System.in);

	System.out.println("Enter 1 for login using phonenum and password");
	System.out.println("Enter 2 for login using Email and password");
	System.out.println("Enter  3 for login using Email(or)phonenum and password");
	System.out.println("enter your choice");
	int choice=scanner.nextInt();
	try
	{
	switch(choice)
	{
	
    case 1:
    	mobile();
		break;
    case 2:
    	email();
    	break;
    case 3:
    	both();
    	break;
	 default:
	    throw new InvalidChoiceException();	
	}
	}
	catch(InvalidChoiceException rv)
	{
		System.out.println(rv);
	}
}
public static void mobile()
{
	String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	String query1="select Name from test.registrationprocess where  PhoneNum=? and Password=?";
	
	Scanner scanner=new Scanner(System.in);
	try
	{
		Connection connection=DriverManager.getConnection(url);
		System.out.println("Connection established");
		
		PreparedStatement preparedStatement=connection.prepareStatement(query1);
		
		System.out.println("Platform");
		
		
		System.out.println("Enter  PhoneNum");
		preparedStatement.setString(1,scanner.next());
		
		System.out.println("Enter Password");
		preparedStatement.setString(2,scanner.next());
		
		ResultSet resultSet=preparedStatement.executeQuery();
		System.out.println("step 3");
		if(resultSet.next())
		{
		 String name =resultSet.getString("Name");
		 System.out.println("Welcome " +name);
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
		
		
		
public static void email()
{
		
			
	String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	String query1="select Name from test.registrationprocess where  EmailId=? and Password=?";
	
	Scanner scanner=new Scanner(System.in);
	try
	{
		Connection connection=DriverManager.getConnection(url);
		System.out.println("Connection established");
		
		PreparedStatement preparedStatement=connection.prepareStatement(query1);
		
		System.out.println("Platform");
		
		
		System.out.println("Enter  EmailId");
		preparedStatement.setString(1,scanner.next());
		
		System.out.println("Enter Password");
		preparedStatement.setString(2,scanner.next());
		
		ResultSet resultSet=preparedStatement.executeQuery();
		System.out.println("step 3");
		if(resultSet.next())
		{
		 String name =resultSet.getString("Name");
		 System.out.println("Welcome " +name);
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
				
     public static void both()
				{
					
					String url="jdbc:mysql://localhost:3306?user=root&password=97051";
					String query="select name from test.registrationprocess where EmailId=? and Password=? or PhoneNum=? and Password=?";
					
						
						try {
							Connection connection = DriverManager.getConnection(url);
						PreparedStatement preparedStatement=connection.prepareStatement(query);
						Scanner scanner=new Scanner(System.in);
						System.out.println("enter EmailId Or PhoneNum");
						String userId=scanner.next();
						preparedStatement.setString(1,userId);
						System.out.println("enter password");
						String pass =scanner.next();
						preparedStatement.setString(2,pass );
						preparedStatement.setString(3,userId );
						preparedStatement.setString(4,pass );
						ResultSet res=preparedStatement.executeQuery();
					    if(res.next())
					    {
					    	String name= res.getString("Name");
					    	System.out.println("welcome" +name);
					    }
					    else
					    {
					    	System.err.println("Invalid Details");
					    	
					    }
					    connection.close();
						
						} catch (SQLException e) 
						{
						
							e.printStackTrace();
						}

}
     public static void update()
     {
    	 String url="jdbc:mysql://localhost:3306?user=root&password=97051";
    	 String qurey1="select name from test.registrationprocess where PhoneNum=?" ;
    	 String query2="update into test.registrationprocess set Password=? where PhoneNum=?";
    	 
    	 try {
			Connection connection=DriverManager.getConnection(url);
			 System.out.println("Connection Established");
			 
			 PreparedStatement preparedStatement=connection.prepareStatement(qurey1);
			 Scanner scanner=new Scanner(System.in);
			 System.out.println("Enter PhoneNum");
			 String phone1=scanner.next();
			 preparedStatement.setString(1, phone1);
			 ResultSet resultSet=preparedStatement.executeQuery();
			 if(resultSet.next())
			 {
				 Random random=new Random();
				 int otp=random.nextInt(10000);
				 if(otp<0)
				 {
					 otp=otp*-1;
				 }
				 System.out.println("Enter otp to verify");
				 System.out.println(otp);
				 int verify=scanner.nextInt();
				 System.out.println("OTP Verified Succesfully");
				 if(otp==verify)
				 {
					 System.out.println("Enter new Password");
					 String pass=scanner.next();
					 PreparedStatement preparedStatement1=connection.prepareStatement(query2);
					 preparedStatement1.setString(1, pass);
					 preparedStatement1.setString(2, phone1);
					 preparedStatement1.executeUpdate();
					 System.out.println("Query executed");
					 }
				 else
				 {
					 System.out.println("Wrong Otp");
				 }
			 }
			 else
				 {
					 System.out.println("Record not Found");
				 }
						 
				 
			 
		} 
    	 catch (SQLException e)
    	 {
			
			e.printStackTrace();
		}
    	
     }

}
