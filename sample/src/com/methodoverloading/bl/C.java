package com.methodoverloading.bl;

public class C {
	public  void run()
	{
		System.out.println("swim the ocean");
	}
	public  void carry()
	{
		System.out.println("catch the ship");
		run();
	}
}
