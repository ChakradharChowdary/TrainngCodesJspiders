package org.jsp.app;

import java.util.Scanner;

public class RemoveDulpicate 
{
  public static void main(String[] args) {
	Scanner  scan =new Scanner(System.in);
	System.out.println("Enter the String");
	String s1=scan.nextLine();
	int count=0;
	int index=-1;
	for( int i=0;i<s1.length();i++)
	{
		count=0;
		char ch=s1.charAt(i);
		while(true)
		{
			index=s1.indexOf(ch, index+1);
			if(index==-1)
			{
				break;
			}
			count++;
			System.out.println(count+""+ch);
		}
		if(count>1)
		{
			System.out.println(ch);
			break;
		}
	}
}
}
