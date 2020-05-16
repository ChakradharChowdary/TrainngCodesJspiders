package com.incdec.ul;

public class Postincrement {
public static void main(String[] args) {
	int a=6;
	System.out.println("a="+a);
	System.out.println(a++);
	System.out.println("a="+a);
	int b=5;
	int res=b++ + b++;
	System.out.println("res="+res);
	System.out.println("b="+b);
}
}
