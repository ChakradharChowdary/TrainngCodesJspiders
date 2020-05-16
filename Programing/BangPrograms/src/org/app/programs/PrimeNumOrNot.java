package org.app.programs;

import java.util.Scanner;

public class PrimeNumOrNot {
		
		public static void main(String[] args) 
		{
			int i, number, count = 0; 
			Scanner	sc = new Scanner(System.in);
			
			System.out.print("  Enter any Number : ");
			number = sc.nextInt();		
			
			for (i = 2; i <= number/2; i++)
			{
				if(number % i == 0)
			    {
					count++;
			        break;
			    }	
			}
			if(count == 0 && number != 1 )
			{
				System.out.println( number + " is a Prime Number");
			}
			else
			{
			   System.out.println(number + " is Not a Prime Number");
			}
		}
	}

