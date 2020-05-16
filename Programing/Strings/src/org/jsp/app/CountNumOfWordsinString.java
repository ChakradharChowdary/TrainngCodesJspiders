package org.jsp.app;

import java.util.Scanner;

public class CountNumOfWordsinString 
{
 public static void main(String[] args) 
 {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the String");
	String s1=scanner.nextLine();
	String[] sArr=s1.split("");
	System.out.println("Given String :"+s1);
	System.err.println("No.of word :"+sArr.length);
}
}
