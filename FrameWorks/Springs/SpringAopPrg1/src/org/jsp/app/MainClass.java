package org.jsp.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass 
{
public static void main(String[] args) 
{
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
context.scan("org.jsp.app");
context.refresh();
Person person=(Person) context.getBean("p1");
person.eat();
person.sleep();
}
}
