package com.methodoverloading.bl;

public class A {
public static void run()
{
	System.out.println("swim the ocean");
}
public static void carry()
{
	System.out.println("catch the ship");
	run();
}
}
