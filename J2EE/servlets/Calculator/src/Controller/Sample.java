package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Sample")
public class Sample extends GenericServlet
{
	int n1;
    int n2;
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException 
	{
		String number1=req.getParameter("n1");
		String number2=req.getParameter("n2");
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(number2);
		addition( n1, n2);
		subtration(n1,n2);
		multiplication(n1,n2);
		division(n1,n2);
	
		PrintWriter printWriter=resp.getWriter();
		printWriter.println();
	}
		
	public  int addition(int n1,int n2)
	{
		int add=n1+n2;
		return add;
	}
	public  int subtration(int n1,int n2)
	{
		int sub=n1-n2;
		return sub;
	}
	public  int multiplication(int n1,int n2)
	{
		int mul=n1*n2;
		return mul;	
	}
	public  int division(int n1,int n2)
	{
		int div=n1/n2;
		return div;
	}

}
