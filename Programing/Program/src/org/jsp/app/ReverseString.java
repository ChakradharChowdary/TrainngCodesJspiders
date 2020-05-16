package org.jsp.app;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String args[])
	  {
		Scanner scanner=new  Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scanner.nextLine().toLowerCase();
		char[] c1=s1.toCharArray();
		String out="";
		for(int i=0;i<c1.length;i++)
		{
			String res="";
			while(i<c1.length &&c1[i]!=' ')
			{
				res=c1[i]+res;
				i++;
			}
			out=out+res+" ";
		}
		String s3=out.trim();
		System.out.println("Given String Is:"+s1);
		System.out.println("Reversed String Is:"+s3);
		
	  }
}
