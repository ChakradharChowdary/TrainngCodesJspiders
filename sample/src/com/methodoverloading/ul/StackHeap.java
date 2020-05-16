package com.methodoverloading.ul;

import com.methodoverloading.bl.ExecutionProcess;

public class StackHeap {
	public static void main(String[] args) {
		System.out.println("**********");
		ExecutionProcess.run();
		ExecutionProcess e1=new ExecutionProcess();
		e1.run1();
	}

}
