package org.jsp.app;

import java.util.Scanner;

public class ReverseaStringUsingArray 
{
 public static void main(String[] args) 
 {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter The String");
	String s1=scanner.next();
	char[] cArr=s1.toCharArray();
	
	for(int i=cArr.length-1;i>=0;i--)
	{
		System.out.print(cArr[i]);
	}
	
}
}
