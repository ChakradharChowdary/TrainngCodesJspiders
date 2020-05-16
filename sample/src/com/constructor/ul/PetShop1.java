package com.constructor.ul;

import com.costructor.bl.Cat1;

public class PetShop1 
{
  public static void main(String[] args) 
  {
   System.out.println("main starts");
   Cat1 c1=new Cat1();
   Cat1 c2=new Cat1();
   Cat1 c3=new Cat1();
   Cat1 c4=new Cat1("tommy");
   Cat1 c5=new Cat1();
   Cat1 c6=new Cat1("pinky");
   System.out.println(c1.CName);
   System.out.println(c2.CName);
   System.out.println(c3.CName);
   System.out.println(c4.CName);
   System.out.println(c5.CName);
   System.out.println(c6.CName);
   System.out.println("main ends");
}
}
