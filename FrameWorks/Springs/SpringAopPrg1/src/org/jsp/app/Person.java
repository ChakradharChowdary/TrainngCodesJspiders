package org.jsp.app;

import org.springframework.stereotype.Component;

@Component("p1")
public class Person 
{
public void eat()
{
	System.out.println("eating!!!");
}
public void sleep()
{
	System.out.println("sleeping!!!!");
}
}
