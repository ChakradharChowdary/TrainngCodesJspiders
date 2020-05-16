package com.constructor.ul;

import com.costructor.bl.Box;

public class FurnitureShop 
{
 public static void main(String[] args) {
	System.out.println("main starts");
	Box b1=new Box(4,6);
	Box b2=new Box(7,9,11);
	b1.dimensions();
	b2.dimensions();
}
}
