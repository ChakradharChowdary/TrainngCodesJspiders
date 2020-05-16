package com.methodoverloading.ul;
import com.methodoverloading.bl.*;
public class Draw {
	public static void main(String[] args) {
		Circle c1=new Circle(10);
		Circle c2=new Circle(20);
		c1.findCircumference();
		c2.findCircumference();
	Rectangle r1=new Rectangle(14,15);
	Rectangle r2=new Rectangle(12,14);
		r1.getArea();
		r2.getArea();
}

}
