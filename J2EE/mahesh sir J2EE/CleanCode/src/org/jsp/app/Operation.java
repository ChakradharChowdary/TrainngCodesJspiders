package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Operation 
{
	
		public static void registration() {
			String url = "jdbc:mysql://localhost:3306?user=root&password=97051";
			String query = "insert into test.registrationprocess values(?,?,?,?)";
			try {
				Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("Welcome to Registration\n");
				System.out.println("Enter Your Name");
				preparedStatement.setString(1, scanner2.next());
				System.out.println("Enter your email id");
				preparedStatement.setString(2, scanner2.next());
				System.out.println("Enter your Phone number");
				preparedStatement.setString(3, scanner2.next());
				System.out.println("Enter Password");
				String pass = scanner2.next();
				preparedStatement.setString(4, pass);
				System.out.println("Confirm Password");
				String cpass = scanner2.next();
				if(pass.equals(cpass)) {
					preparedStatement.executeUpdate();
					System.out.println("Registration Successful");
				}else {
					System.err.println("Password not matched");
					System.err.println("Try again");
				}
			scanner2.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


		public static void login() {
			System.out.println("Enter 1 for login using Phone and password");
			System.out.println("Enter 2 for login using email and password");
			System.out.println("Enter 3 for login using Phone/email and password");
			
			try {
				Scanner scanner3 = new Scanner(System.in);
				int n = scanner3.nextInt();
				switch(n){
				case 1:
					phone();
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
//				scanner3.close();
			}catch(InvalidChoiceException rv) {
				System.out.println(rv);
			}
			
		}

		public static void phone() {
			String url = "jdbc:mysql://localhost:3306?user=root&password=97051";
			String query = "select Name from test.registrationprocess where PhoneNum=? and Password=?";
			try {
				Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				Scanner scanner4 = new Scanner(System.in);
				System.out.println("Enter Mobile Number");
				preparedStatement.setString(1, scanner4.next());
				System.out.println("Enter password");
				preparedStatement.setString(2, scanner4.next());
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					String name = resultSet.getString("Name");
					System.out.println("Welcome  "+name);
				}else {
					System.err.println("Invalid details\n");
					
					
				}
				connection.close();
//				scanner4.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}


		public static void email() {
			String url = "jdbc:mysql://localhost:3306?user=root&password=97051";
			String query = "select Name from test.registrationprocess where EmailId=? and Password=?";
			try {
				Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				Scanner scanner5 = new Scanner(System.in);
				System.out.println("Enter email");
				preparedStatement.setString(1, scanner5.next());
				System.out.println("Enter password");
				preparedStatement.setString(2, scanner5.next());
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					String name = resultSet.getString("Name");
					System.out.println("Welcome  "+name);
				}
				else {
					System.err.println("Invalid details");
				}
//				scanner5.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public static void both() {
			String url ="jdbc:mysql://localhost:3306?user=root&password=97051";
			String query = "select Name from test.registrationprocess where EmailId=? and Password=? or PhoneNum=? and Password=?";
			try {
				Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				Scanner scanner6 = new Scanner(System.in);
				System.out.println("Enter E-mail or Phone Number");
				String userId = scanner6.next();
				preparedStatement.setString(1, userId);
				System.out.println("Enter Password");
				String pass = scanner6.next();
				preparedStatement.setString(2, pass);
				preparedStatement.setString(3, userId);
				preparedStatement.setString(4, pass);
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					String name = resultSet.getString("Name");
					System.out.println("Welcome  "+name);
				}else {
					System.err.println("Invalid Details");
				}
			scanner6.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public static void update() {
			String url ="jdbc:mysql://localhost:3306?user=root&password=97051";
			String query1 = "select Name from test.registrationprocess where PhoneNum=?";
			String Query2 = "update test.registrationprocess set Password=? where PhoneNum=?";
			try {
				Connection connection = DriverManager.getConnection(url);
				PreparedStatement preparedStatement = connection.prepareStatement(query1);
				Scanner scanner7 = new Scanner(System.in);
				System.out.println("Enter Mobile");
				String oMobile = scanner7.next();
				preparedStatement.setString(1, oMobile);
				ResultSet resultSet = preparedStatement.executeQuery();
				if(resultSet.next()) {
					Random random = new Random();
					int otp = random.nextInt(10000);
					if(otp<0) {
						otp = otp*-1;
					}
					System.out.println("Enter otp to verify");
					System.out.println(otp);
					int verify = scanner7.nextInt();
					System.out.println("otp verified succesfully");
					if(otp==verify) {
						System.out.println("Enter new password");
						String nMobile = scanner7.next();
						PreparedStatement preparedStatement1 = connection.prepareStatement(Query2);
						preparedStatement1.setString(1, nMobile);
						preparedStatement1.setString(2, oMobile);
						preparedStatement1.executeUpdate();
						System.out.println("Password Updated");

					}else {
						System.err.println("wrong otp");
					}
				}else {
					System.err.println("Record not found");
				}
			scanner7.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}



