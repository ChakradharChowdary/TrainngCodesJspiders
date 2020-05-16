package com.inheritance.ul;
import com.inheritance.bl.*;
public class MultiLevel {
	public static void main(String[] args) {
		X x1=new X(10);
		System.out.println(x1.i);
		Y y1=new Y(20,8.8);
		System.out.println(y1.i);
		System.out.println(y1.j);
		Z z1=new Z(80,8.9,20);
		System.out.println(z1.i);
		System.out.println(z1.j);
		System.out.println(z1.k);
	}

}
