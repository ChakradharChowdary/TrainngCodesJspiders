package org.jsp.app;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates
{


public static void main(String[] args)
{
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter Array Size");
 int size=scan.nextInt();
 System.out.println("Enter "+size+"array Elements");
 int[] a1=new int[size];
 for(int i=0;i<size;i++)
 {
	 a1[i]=scan.nextInt();
 }
 System.out.println("The array created is : :"+Arrays.toString(a1));
 for(int i=0;i<a1.length;i++)
 {
	 for(int j=i+1; j<a1.length;j++)
	 {
		 if(a1[i]==a1[j])
		 {
			 
		 }
	 }
 }
}
}
