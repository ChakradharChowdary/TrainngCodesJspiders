package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
 public static void main(String[] args) 
 {
  ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
  Employee e1=(Employee) context.getBean("s2");
  System.out.println(e1);
}
}
