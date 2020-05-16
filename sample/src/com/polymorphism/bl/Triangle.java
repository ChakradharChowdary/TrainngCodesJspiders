package com.polymorphism.bl;

public class Triangle extends Shape
{
  public int b;
  public int h;
  public int area;
  public Triangle(int b,int h )
  {
	  this.b=b;
	  this.h=h;
  }
  public void findArea()
  {
	  public area=0.5*this.b*this.h;
	  System.out.println("Area of the Triangle is:"+area);
	  
  }
}
