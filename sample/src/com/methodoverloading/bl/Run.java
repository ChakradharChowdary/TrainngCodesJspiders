package com.methodoverloading.bl;

public class Run {
	public static void move(int i,int j)
	{
		System.out.println("inside move method of int,int args..");
		System.out.println(i);
		System.out.println(j);
	}
	public static void move(int i,double j)
	{
		System.out.println("inside move method of int,double args..");
		System.out.println(i);
		System.out.println(j);
	}
	public static void move(double i,int j)
	{
		System.out.println("inside move method of double,int args..");
		System.out.println(i);
		System.out.println(j);
	}
	public static void move(int i,int j,double k)
	{
		System.out.println("inside move method of int,int,double args..");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
