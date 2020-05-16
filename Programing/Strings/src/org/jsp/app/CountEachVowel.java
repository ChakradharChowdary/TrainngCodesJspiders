package org.jsp.app;

import java.util.Scanner;

public class CountEachVowel 
{
  public static void main(String[] args) 
  {
	Scanner scanner=new Scanner(System.in);
	String s1="aeiou";
	System.out.println("Enter The String");
	String s2=scanner.next().toLowerCase();
	for(int i=0;i<=s1.length()-1;i++)
	{
		char c1=s1.charAt(i);
		int count=0;
		for(int j=0;j<=s2.length()-1;j++)
		{
			char c2=s2.charAt(j);
			if(c1==c2)
			{
				count++;
			}
		}
	System.out.println("Vowel"+c1+"count:"+count);	
	}
}
}
