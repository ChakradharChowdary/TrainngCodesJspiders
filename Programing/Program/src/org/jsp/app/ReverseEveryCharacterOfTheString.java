package org.jsp.app;

import java.util.Scanner;

public class ReverseEveryCharacterOfTheString
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Array");
	int num=scanner.nextInt();
	System.out.println("Given Number is :"+num);
	int rem;
	int rev=0;
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println("Reversed Number Is :"+rev);
	}

}
