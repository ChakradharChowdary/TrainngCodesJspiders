package org.jsp.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Demo2")
public class Demo2 extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
		Random random=new Random();
		int otp=random.nextInt(10000);
		otp=(otp<0)?otp*-1:otp;
		System.out.println(otp);
		
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.println();
		
	}

}
