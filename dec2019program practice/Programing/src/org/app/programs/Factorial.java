package org.app.programs;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the factorial number");
	int fact=scanner.nextInt();
	int out=1;
	for(int i=fact;i>1;i--) {
		out=out*i;
	}
	System.out.println("factorial of"+fact+"is"+out);
}
/*concept
if 5 is my input
the output should be 5*4*3*2*1=120 . */
}
