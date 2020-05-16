package com.arrays.ul;

public class CountChar
{
public static String case2(String s1)
{
	char[]ch=s1.toCharArray();
	int count=1;
	for(int i=0;i<ch.length;i++)
	{
	  if(ch[i]=='')
			count++;
	}
	return count;
}
public static void main(String[] args) {
	String s1=case2("java is easy");
	System.out.println(s1);
}
}
