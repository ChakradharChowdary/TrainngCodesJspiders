package com.incdec.ul;

public class SumArrayElements
{
	public static void main(String[] args) {
		int ar[]= {5,8,9,3,4,6};
		int sum=0;
		System.out.println("Sum of the array elements are");
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println(sum);
	}
}