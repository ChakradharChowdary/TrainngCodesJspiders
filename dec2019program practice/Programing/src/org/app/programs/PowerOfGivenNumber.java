package org.app.programs;

import java.util.Scanner;

public class PowerOfGivenNumber {
	public static int pow(int num,int pwr)
	{
		int out=1;
		for(int i=0 ;i<pwr;i++)
		{
			out=out*num;
		}
		return out;
	}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Number");
	int num1=scanner.nextInt();
	System.out.println("Enter the power");
	int pwr1=scanner.nextInt();
	
	int res=pow(num1,pwr1);
	System.out.println("Power of "+num1+"is :"+res);
}
}
