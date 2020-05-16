package com.polymorphism.bl;

public class Circle extends Shape
{
 public  int r;
  final static double pi=3.14;
  public double area;
 public Circle(int r)
 {
	this.r=r; 
 }
 public void findArea()
 {
	public area=3.14*this.r*this.r;
	 System.out.println("Area of the Circle is :"+area);
 }
}
