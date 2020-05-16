package org.jsp.app;

import java.util.Scanner;

public class CountVowel
{
 public static void main(String[] args)
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the String");
  String s1=scanner.next();
  String s2=s1.toLowerCase();
  int count=0;
  for(int i=0;i<=s2.length()-1;i++)
  {
	  char c1=s2.charAt(i);
	  if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
	  {
		  count++;
	  }
  }
  System.out.println("Given String :"+s1);
  System.out.println("Count Of Vowels :" +count);
}
}
