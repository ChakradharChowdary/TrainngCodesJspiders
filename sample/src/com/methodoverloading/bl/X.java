package com.methodoverloading.bl;

public class X {
public static void zenco(int i, int j)
{
	System.out.println("inside zenco method of int,int");
	System.out.println(i);
	System.out.println(j);
}
public static void zenco(double i, int j)
{
	System.out.println("inside zenco method of double,int");
	System.out.println(i);
	System.out.println(j);
}
}
