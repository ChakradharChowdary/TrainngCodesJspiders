package com.methodoverloading.bl;

public class Circle {
public int r;
public static double pi=3.14;
public Circle(int r)
{
	this.r=r;
}
public void findCircumference()
{
	double res=2*pi*this.r;
	System.out.println("circumference of a circle:"+res);
}
}
