package org.chakri.app;

import java.util.Scanner;

public class ReverseOfAString
{
  public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter The String");
	String s1=scanner.nextLine();
	char[]c1=s1.toCharArray();
	String out="";
	for(int i=0;i<c1.length;i++)
	{
		String res="";
		while(i<c1.length&&c1[i]!=' ')
		{
			res=res+c1[i];
			i++;
		}
		out=res+" "+out;
	}
	String s2=out.trim();
	System.out.println("Given String is :"+s1);
	System.out.println("Reversed String Is :"+s2);
}
}
/*input=java is my world
 output=world my is java */