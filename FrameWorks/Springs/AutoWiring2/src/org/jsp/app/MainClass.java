package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
 public static void main(String[] args) 
 {
 ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
 University u2=(University)context.getBean("u1");
 System.out.println(u2);
}
}
