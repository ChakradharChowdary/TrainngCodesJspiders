package com.arrays.bl;

public class Code {
public static String reper(String s1,String s2)
{
	char[]c1=s1.toCharArray();
	char[]c2=s2.toCharArray();
	String out="";
	for(int i=0;i<c1.length;i++)
	{
		for(int j=0;j<c2.length;j++)
		{
			if(c1[i]!=c2[j])
			{
				out=out+c1[i];
			}
		}
	}
	return out;
}
}