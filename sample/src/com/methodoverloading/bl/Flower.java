package com.methodoverloading.bl;

public class Flower {
	public String fname;
	public int petals;
	public String colour;
	public Flower()
	{
		this.fname="rose";
		this.petals=12;
		this.colour="Red";
	}
	public Flower(String fname,int petals,String colour)
	{
		this.fname=fname;
		this.petals=petals;
		this.colour=colour;
	}
	public void flowerInfo()
	{
		System.out.println("inside the flowerInfo..");
		System.out.println("flower fname is:"+this.fname);
		System.out.println("flower petals is:"+this.petals);
		System.out.println("flower colour is:"+this.colour);
	}
}
