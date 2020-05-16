package org.jsp.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args)
	{
String choice="Y";
String choice2="y";
String choice1;
do
{
	try {
		loop();
	}
	catch(InputMismatchException rv) 
	{
		System.out.println(rv);
	}
	System.out.println("Press Y to continue or any key to exit");
	Scanner scanner=new Scanner(System.in);
	choice1=scanner.next();
}
while(choice.equals(choice1)||choice1.equals(choice2));
 System.out.println("You are Exit out of the application");
}
public static void loop()
{
System.out.println("Enter Your Option");
System.out.println("Enter 1 for Registration");
System.out.println("Enter 2 for Login");
System.out.println("Enter 3 for Update");
int s;
Scanner scanner=new Scanner(System.in);
try
{
	int n=scanner.nextInt();
switch(n)
{
case 1:
	Operation.registration();
    break;
case 2:
	try {
	Operation.login();
	}catch(InputMismatchException rv) {
		System.out.println(rv);
	}
	break;
case 3:
	Operation.update();
    break;
default:
	throw new InvalidOptionException();
}
}catch(InvalidOptionException rv) {
	System.out.println(rv);
}
}
	}


