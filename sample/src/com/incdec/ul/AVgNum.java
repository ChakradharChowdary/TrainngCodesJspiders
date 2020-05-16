package com.incdec.ul;

public class AVgNum {
  public static void main(String[] args) {
	int sum=0;
	int n=10;
	for(int i=1;i<=10;i++)
	{
		sum+=i;
  }
  
    double avg=sum/n;
    System.out.println("The Average of"+n+" number is"+avg);
	
}
}
