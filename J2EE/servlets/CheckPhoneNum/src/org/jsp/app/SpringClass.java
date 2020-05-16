package org.jsp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SpringClass 
{
	

	@RequestMapping("/mobile")
  public ModelAndView mobile(@RequestParam("pn")String Phone)
  {
	  String url="jdbc:mysql://localhost:3306?user=root&password=97051";
	  String query="Select MobileNo from test.registration where MobileNo=?";
	  ModelAndView modelAndView1=null;
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url);
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, Phone);
		ResultSet  resultSet=preparedStatement.executeQuery();
		
	    
	     
		if(resultSet.next())
		{
		   modelAndView1=new ModelAndView("jar", "chakri", "Mobile Num is Valid");
		}
		else
		{
		  modelAndView1=new ModelAndView("jar", "chakri", "Mobile Num is Invalid");
		}
	  } catch (Exception e) {
	
		e.printStackTrace();
	}
	  
	return modelAndView1;
  }
  
  
}
