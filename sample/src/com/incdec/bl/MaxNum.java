package com.incdec.bl;

public class MaxNum
{
public static int [] max()
{
	int max=ar[0];
	for (int i=1;i<ar.length;i++)
	{
	 if(max<ar[i])
	 {
		 max=ar[i];
	 }
	}
	return max;
}
}
