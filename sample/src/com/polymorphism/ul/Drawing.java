package com.polymorphism.ul;
import com.polymorphism.bl.*;
public class Drawing 
{
public static void main(String[] args)
{
	displayArea(new Circle(2));
	displayArea(new Rectangle(5,6));
	displayArea(new Triangle(8,6));
}
public static void displayArea(Shape s1)
{
	s1.findArea();
}
}
