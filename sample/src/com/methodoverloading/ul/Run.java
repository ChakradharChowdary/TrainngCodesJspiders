package com.methodoverloading.ul;

public class Run {
	int b=33;
	public static void main(String[] args) {
		System.out.println("main ends");
		Run r1=new Run();
		Run r2=new Run();
		System.out.println(r1.b);
		System.out.println(r2.b);
		r1.b=88;
		System.out.println(r1.b);
		System.out.println(r2.b);
		System.out.println("main ends");
		
	}

}
