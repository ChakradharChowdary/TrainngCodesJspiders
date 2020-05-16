package com.polymorphism.bl;

public class Rectangle extends Shape
{
  public int l;
  public int w;
  public int area;
   public Rectangle(int l,int w)
  {
	  this.l=l;
	  this.w=w;
	  }
  public void findArea()
  {
	  public area=this.l*this.w;
	  System.out.println("Area of the Rectangle is:"+area);
  }
}
