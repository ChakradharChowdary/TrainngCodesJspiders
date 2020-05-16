package org.jsp.app;

import java.util.Scanner;

public class CountString 
{
 public static void main(String[] args) 
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the String...");
  String s1=scanner.next();
  System.out.println("Enter the Character...");
  String s2=scanner.next();
  char c1=s2.charAt(0);
  int count=0;
  for(int i=0;i<=s1.length()-1;i++)
  {
	  char c2=s1.charAt(i);
	  if(c1==c2)
	  {
		  count++;
	  }
  }
  System.out.println("Giving String:"+s1);
  System.out.println("Given Char:"+c1);
  System.out.println("char count"+count);
}
}
