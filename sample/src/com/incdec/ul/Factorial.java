package com.incdec.ul;

public class Factorial {
public static int isFact(int num)
{
	int out=1;
	for(int i=num;i>1;i--)
	{
		out=out*i;
		
	}
	return out;
}
public static void main(String[] args)
{
	int res=isFact(8);
	System.out.println("res="+res);
}
}
