package org.jsp.app;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
//creates object
@Aspect
// combination of pointcut and advice
@EnableAspectJAutoProxy 
// connecting two classes
public class CrossCutting 
{
@After("execution(public void eat())")
public void  walk()
{
	System.out.println("walking!!!");
}
@Before("execution(public void eat())")
public void gym()
{
	System.out.println("notGoing");
}
}
