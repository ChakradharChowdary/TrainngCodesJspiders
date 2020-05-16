package com.methodoverloading.ul;

import com.methodoverloading.bl.Run;

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println("main starts");
		Run.move(20, 30);
		Run.move(88, 4.0);
		Run.move(8.9, 80);
		Run.move(60, 55, 9.0);
		System.out.println("main ends");
	}

}
