package org.jsp.app;

import java.util.Random;

public class MainClass
{
  public static void main(String[] args)
  {
	Random random=new Random();
	int otp=random.nextInt(10000);
	otp=(otp<0)?otp*-1:otp;
	System.out.println("G-"+otp);
}
}
