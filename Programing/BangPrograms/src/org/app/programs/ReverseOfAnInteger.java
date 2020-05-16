package org.app.programs;

import java.util.Scanner;

public class ReverseOfAnInteger {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter The Number");
	int num=scanner.nextInt();
	int rem,rev=0;
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println("Reverse Of a Number is:"+rev);
}
}
