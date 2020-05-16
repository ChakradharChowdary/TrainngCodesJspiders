package com.incdec.ul;

public class Preincrement {
public static void main(String[] args) {
	int a=25;
	System.out.println("a="+a);
	System.out.println(++a);
	System.out.println("a="+a);
	int b=35;
	int res=++b + ++b;
	System.out.println("res="+res);
	System.out.println("b="+b);
}
}
