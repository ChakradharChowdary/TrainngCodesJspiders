package com.methodoverloading.bl;

public class D {
	public void run()
	{
		System.out.println("swim the ocean");
	}
	public static void carry()
	{
		System.out.println("catch the ship");
		D d1=new D();
		d1.run();
	}
}
