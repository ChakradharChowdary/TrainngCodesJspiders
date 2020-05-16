package com.inheritance.ul;
import com.inheritance.bl.*;
public class SingleLevel1 {
public static void main(String[] args) {
	C c1=new C(8.8,10,9.8);
	System.out.println(c1.i);
	System.out.println(c1.j);
	System.out.println(c1.k);
	System.out.println("*********************");
	D d1=new D(7.7,30,8.8,80);
	System.out.println(d1.i);
	System.out.println(d1.j);
	System.out.println(d1.k);
	System.out.println(d1.x);
}
}
