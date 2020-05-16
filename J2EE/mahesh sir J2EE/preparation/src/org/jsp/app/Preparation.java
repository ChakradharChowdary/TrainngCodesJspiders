package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Preparation
{
String url="jdbc:mysql://localhost:3306?user=root&password=97051";

try
{
Connection connection=DriverManager.getConnection(url);
}
catch(SQLException e)
{
	e.printStackTrace();
}
}
