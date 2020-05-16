package com.costructor.bl;

public class Box 
{
  public int l;
  public int w;
  public int h;
 public Box(int l,int w)
 {
	 this.l=l;
	 this.w=w;
 }
 public Box(int l,int w,int h)
 {
	 this(l,w);
	 this.h=h;
 }
 public void dimensions()
 {
	 System.out.println("lenth:"+this.l);
	 System.out.println("width:"+this.w);
	 System.out.println("heigth:"+this.h);
 }
}
