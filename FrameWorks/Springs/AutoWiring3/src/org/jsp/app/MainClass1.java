package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass1
{
	public static void main(String[] args)
	 {
		 ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
		 Car1 c2=(Car1) context.getBean("c3");
		 System.out.println(c2);
	 }
		
}
