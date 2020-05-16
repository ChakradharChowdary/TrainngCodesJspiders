package com.upanddowncasting.ul;
import com.upanddowncasting.bl.*;
public class Test {
public static void main(String[] args) {
	A a1=(A)new B();
	a1.move();
	B b1=(B)a1;
	b1.move();
	b1.walk();
}
}
