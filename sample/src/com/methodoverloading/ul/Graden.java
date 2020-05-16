package com.methodoverloading.ul;
import com.methodoverloading.bl.*;
public class Graden {
public static void main(String[] args) {
	Flower f1=new Flower();
	Flower f2=new Flower();
	Flower f3=new Flower();
	Flower f4=new Flower("jasmin",10,"white");
	f1.flowerInfo();
	f2.flowerInfo();
	f3.flowerInfo();
	f4.flowerInfo();
}
}
