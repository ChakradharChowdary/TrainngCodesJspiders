package org.app.programs;

import java.util.Scanner;

public class ArmStrong 
{
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Amstrong Number");
	int number=scanner.nextInt();
	int count=0,result,temp;
	temp=number;
	while(number>1) {
		result=number%10;
		number=number/10;
		count=count+(result*result*result);
	}
	if(count==temp) {
		System.out.println(count+"is Amstrong Number");
	}
	else {
		System.out.println(count+"Is Not a AmStrong Number");
	}
}
 /*concept
       if 371 is my input
       the output should be 3 cube+7 cube +1 cube=371 
       then it is AmStrong Number Else Not. */
}
