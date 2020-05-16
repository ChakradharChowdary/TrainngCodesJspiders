package com.methodoverloading.ul;

import com.methodoverloading.bl.MethodReturn;

public class Return {
	public static void main(String[] args) {
		int k=MethodReturn.test();
		System.out.println(k);
		char j=MethodReturn.test1();
		System.out.println(j);
		boolean i=MethodReturn.test2();
		System.out.println(i);
	}

}
