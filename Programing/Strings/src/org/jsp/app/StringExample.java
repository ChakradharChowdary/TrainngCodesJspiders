package org.jsp.app;

import java.util.Scanner;

public class StringExample 
{
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the StringArray Size");
	int size=scan.nextInt();
 String []s1=new String[size];
	System.out.println("enter the "+size+"String values");
	for(int i=0;i<s1.length;i++)
	{
		s1[i]=scan.next();
	}
	for(int i=0;i<s1.length;i++)
	{
		System.out.println(s1[i]);
	}
	for(int i=0;i<s1.length;i++)
	{
		for(int j=i+1;j<s1.length;j++)
		{
			
		}
	}
}
}
