package org.app.programs;

import java.util.Scanner;

public class PrimeOrNot 
{
 public static void main(String[] args) 
 {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Number");
	int integer1=scanner.nextInt();
	if(integer1==0 || integer1==1)
	{
		System.out.println("Given Numner is :"+integer1+" "+"Not primeNumber");
	}
	for(int i=2;i<=integer1/2;i++)
	{
		if(integer1%i==0)
		{
			System.out.println("Given Numner is :"+integer1+" "+"Not primeNumber");
		}else
		{
		System.out.println("Given Numner is :"+integer1+" "+" primeNumber");
		}
	}
}
}
