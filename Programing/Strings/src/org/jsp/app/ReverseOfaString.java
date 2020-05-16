package org.jsp.app;

import java.util.Scanner;

public class ReverseOfaString 
{
 public static void main(String[] args) 
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter the String");
  String s1=scanner.next();
  String s2="";
  for(int i=s1.length()-1;i>=0;i--)
  {
	 s2=s2+s1.charAt(i); 
  }
  System.out.println("GivenString:"+s1);
  System.out.println("Reversed :"+s2);
}
}
