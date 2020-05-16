package demopack.ul;

import demopack.bl.Emp;

public class Company 
{
 public static void main(String[] args) {
	Emp e1=new Emp(32,"raja",3335.8);
	Emp e2=new Emp(33,"rani",3346.8);
	System.out.println(e1);
	System.out.println(e2);
	boolean status= e1.equals(e2);
	System.out.println(status);
}
}
