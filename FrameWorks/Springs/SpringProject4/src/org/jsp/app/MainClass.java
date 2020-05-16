package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
  public static void main(String[] args) 
  {
	ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
   Student s2=(Student) context.getBean("s3");
   System.out.println(s2);
}
}
