package com.arrays.bl;

public class CountNonRepeateSum 
{
public static void occurance(int[] ar)
{
	int n=ar.length;
	for(int i=0;i<n;i++)
	{ 
	 int counter=0;
	 for(int j=i+1;j<n;j++)
	 {
		 if(ar[i]==ar[j])
		 {
			 counter++;
			 int k=1;
			 while (k<n-1)
			 {
				 ar[k]=ar[k+1];
				 k++;
			 }
			 n--;
			 j--;
		 }
	 }
	 System.out.println(ar[i]+"is occuring"+counter+"times");
	}
}
}
