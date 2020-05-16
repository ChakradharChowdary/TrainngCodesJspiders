package com.inheritance.ul;
import com.inheritance.bl.*;
public class SingleLevel {
public static void main(String[] args)
{
	System.out.println("main starts");
	A a1=new A(5);
	System.out.println(a1.i);
	System.out.println("*******************");
	B b1=new B(7,9);
	System.out.println(b1.i);
	System.out.println(b1.j);
	
}
}
