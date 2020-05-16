package org.jsp.app.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmailLogin 
{
	public static void run(String nm,String em,String pas)
	  {
		String url="jdbc:mysql://localhost:3306?user=root&password=97051";
		String query="insert into test.checkid values(?,?,?)";
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement(query);

			
			preparedStatement.setString(1, nm );
			
			preparedStatement.setString(2, em );
	
			preparedStatement.setString(3, pas);
			preparedStatement.executeUpdate();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
