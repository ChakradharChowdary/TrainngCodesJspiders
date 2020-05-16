package org.jsp.app.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmailLogin 
{
  public static void main(String[] args) 
  {
	String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	String query="insert into test.checkid values(?,?,?)";
	 
	try {
		Connection connection=DriverManager.getConnection(url);
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, query);
		preparedStatement.setString(2, query);
		preparedStatement.setString(3, query);
		preparedStatement.executeUpdate();
		connection.close();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
