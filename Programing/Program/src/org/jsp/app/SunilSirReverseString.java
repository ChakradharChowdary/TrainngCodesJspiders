package org.jsp.app;

import java.util.Scanner;

public class SunilSirReverseString 
{
 public static void main(String[] args) 
 {
 Scanner  scanner=new Scanner(System.in);
 System.out.println("Enter the String");
 String s1=scanner.nextLine().toLowerCase();
 String []c1=s1.split(" ");
 String s2="";
 for(int i=c1.length-1;i>=1;i--)
 {
	 s2=s2+c1[i]+" ";
 }
  String s3=s2+c1[0];
  System.out.println("Given String is:"+s1);
  System.out.println("Reversed String is :"+s3);
	/*Scanner scanner=new Scanner(System.in);
	System.out.println("enter the String");
	String s1=scanner.nextLine();
	char []c1=s1.toCharArray();
	String out="";
	for(int i=0;i<c1.length;i++)
	{
		String res="";
		while(i<c1.length)
		{
			res=res+c1[i];
			i++;
		}
		out=res+" "+out;
		}
	String s2=out.trim();
	System.out.println("Given String Is :"+s1);
	System.out.println("Reversed String Is:"+s2);*/
}
 
}
