package com.incdec.ul;

public class PostPreDecrement {
public static void main(String[] args) {
	int a=10;
	System.out.println("a="+a);
	System.err.println(--a);
	System.out.println("a="+a);
	int b=30;
	int res=--b + --b;
	System.out.println("res="+res);
	System.out.println("b="+b);
	int c=30;
	System.out.println("c="+c);
	System.out.println(c--);
	System.out.println("c="+c);
	int d=14;
	int res1=d-- + d--;
	System.out.println("res="+res);
	System.out.println("d="+d);
}
}
