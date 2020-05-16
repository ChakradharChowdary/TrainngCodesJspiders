package com.accessmembers.ul;

import com.accessspecifier.bl.MultipleClass;

public class MultipleClass2 
{
public static void main(String[] args) {
	System.out.println(MultipleClass.i);
	MultipleClass m1=new MultipleClass();
	System.out.println(m1.j);
	com.adstract.bl.MultipleClass1 m2=new com.adstract.bl.MultipleClass1();
	System.out.println(m2.j);
}
}
