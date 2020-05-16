package com.inheritance.ul;
import com.inheritance.bl.*;
public class Hierartical {
public static void main(String[] args) {
	A1 a1=new A1(80);
	System.out.println(a1.x);
	B1 b1=new B1(90,8.9);
	System.out.println(b1.x);
	System.out.println(b1.y);
	C1 c1=new C1(78,8.0);
	System.out.println(c1.x);
	System.out.println(c1.z);
}
}
