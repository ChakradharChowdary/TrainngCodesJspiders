package org.jsp.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass
{
public static void main(String[] args) 
{
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
  context.scan("org.jsp.app");
  context.refresh();
  Hospital h1=(Hospital) context.getBean("h2");
  System.out.println(h1);
}
}
