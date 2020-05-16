package com.arrays.ul;

public class DeleteString
{
 public static String delete(String s1)
 {
	 char[]ar=s1.toCharArray();
	 int n=ar.length;
	 for(int i=0;i<n-1;i++)
	 {
		 for(int j=i+1;j<n;j++)
		 {
			 if(ar[i]==ar[j])
			 {
				 int k=j;
				 while(k<n-1)
				 {
					 ar[k]=ar[k+1];
					 k++;
				}
				 n--;
				 j--;
			 }
		 }
	 }
	 String out="";
	 for(int i=0;i<n;i++)
	 {
		 out=out+ar[i];
	 }
	 return out;
 }
 public static void main(String[] args) {
	String s1=delete("leela");
	System.out.println("charcters after deletion");
	System.out.println(s1);
}
}
