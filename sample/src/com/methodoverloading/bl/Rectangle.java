package com.methodoverloading.bl;

public class Rectangle {
public int l;
public int w;
public Rectangle(int l,int w)
{
	this.l=l;
	this.w=w;
}
	public void getArea()
	{
		int res=this.l*this.w;
		System.out.println("area of the Circle:"+res);
	}
}

