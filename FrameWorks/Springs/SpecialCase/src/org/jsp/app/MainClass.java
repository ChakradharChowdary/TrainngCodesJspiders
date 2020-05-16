package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
 public static void main(String[] args) 
 {
 ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
 Student stu=(Student) context.getBean("s1");
 System.out.println(stu);
}
}
