package com.methodoverloading.ul;

import com.methodoverloading.bl.Run1;

public class Ram {
	public static void main(String[] args) {
	 System.out.println("main starts");
	 Run1 r1=new Run1();
	 Run1 r2=new Run1();
	 r1.test();
	 r2.test();
	 System.out.println("main ends");
	}

}
