package com.incdec.ul;

public class MultiplesOf3 {
	public static void main(String[] args) {
		int sumOf3=0; 
		
		for(int i=1;i<50;i++)
		{
		if(i%3==0)
		{
				sumOf3=sumOf3+i;
		}
		}
	    System.out.println(sumOf3);
	}

}
