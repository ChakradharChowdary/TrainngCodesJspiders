package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
  public static void main(String[] args) {
	//Using CoreJava
	  Sample s1=new Sample();
	  s1.freek();
	  Demo d1=new Demo();
	  d1.greek();
	  //Using Spring Frameworks
	  ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
	  Sample s11=(Sample) context.getBean("s1");
	  Demo d11=(Demo) context.getBean("d1");
	  s11.freek();
	  d11.greek();
}
}
