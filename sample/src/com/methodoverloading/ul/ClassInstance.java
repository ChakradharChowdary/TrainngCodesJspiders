package com.methodoverloading.ul;

public class ClassInstance {
	static int a=32;
	int b=34;
	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(a);
		 ClassInstance  t1=new  ClassInstance();
		 ClassInstance  t2=new  ClassInstance();
		 System.out.println(t1.b);
		 System.out.println(t2.b);
		 System.out.println("main ends");
		}
}
