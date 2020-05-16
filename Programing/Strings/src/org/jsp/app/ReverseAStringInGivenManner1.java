package org.jsp.app;

import java.util.Scanner;

public class ReverseAStringInGivenManner1 
{
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=scan.nextLine();
		String []sArr=s1.split("");
	 	for(int i=0;i<=sArr.length-1;i++)
	 	{
	 		sArr[i]=reverse(sArr[i]);
	 	}
	 	String fs="";
	 	for(int i=0;i<=sArr.length-2;i++)
	 	{
	 		fs=sArr[i]+fs+"";
	 	}
	 	fs=fs+sArr[sArr.length-1];
	 	System.out.println("Given String :"+s1);
	 	System.out.println("Reversed String :"+fs);
	}
	public static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return s;
		
	}
}
