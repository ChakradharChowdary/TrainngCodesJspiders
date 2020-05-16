package com.incdec.ul;

public class EvenOdd 
{
	public static void main(String[] args)
	{
		int Even=0;
int[]ar={1,2,3,4,5,6,7,8,9};
for (int i=0;i<ar.length;i++)
{
	if(ar[i]%2==0)
		Even=Even+ar[i];
	System.out.println("print only even is="+Even);
}
}
}
