package org.jsp.app;

import java.util.Scanner;

public class ReverseAStringInGivenManner
{
//String i/p="java html web sql"//
	//o/p="sql web html java"//
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scanner.nextLine();
		String [] sArr=s1.split("");
		String s2="";
		for(int i=sArr.length-1;i>=0;i--)
		{
			s2=s2+sArr[i]+"";
		}
		String s3=s2.trim();
		System.out.println("Given String :" +s1);
		System.out.println("Reversed String :"+s3);
	}
}
