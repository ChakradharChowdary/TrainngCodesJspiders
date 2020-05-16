package org.chakri.app;

import java.util.Scanner;

public class ReverseOfPalindrome {
  public static void main(String[] args) {
	Scanner scanner=new  Scanner(System.in);
	System.out.println("Enter The String With Intergers");
	String s1=scanner.nextLine();
	char[]c1=s1.toCharArray();
	String out="";
	for(int i=0;i<c1.length;i++)
	{
		String res="";
		int count=0;
		while(i<c1.length&&c1[i]!=' ')
		{
			if(c1[i]>'a'&& c1[i]<'z' ||
				c1[i]>'A'&& c1[i]<'Z')
			{
				res=res+c1[i];
			}
			else
			{
				count=count+(c1[i]-48);
			}
			i++;
			
		}
		out=out+res+count;
	}
	System.out.println("Given String Is :"+s1);
	System.out.println("Output String Is :"+out);
}
}
