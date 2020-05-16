package org.jsp.app;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Prg2 
{
	public static void main(String[] args) 
	{
	 Vector a1=new Vector();
	 a1.add(10);
	 a1.add(2.6);
	 a1.add('$');
	 a1.add("ravi");
	 System.out.println(a1);
	 Vector a2=new Vector();
	 a2.add(28);
	 a2.add(2.99);
	 a2.add('$');
	 a2.add("Chakri");
	 a2.add(28);
	 a2.add("chakri");
	 a2.addAll(a1);
	 System.out.println(a2);
	 int numOfObj=a1.size();
	 System.out.println(numOfObj);
	 int numOfObj1=a2.size();
	 System.out.println(numOfObj1);
	 Object o1=a1.get(3);
	 Object o2=a2.get(5);
	 Boolean b1=a1.contains(10);
	 System.out.println(b1);
	 boolean b2=a1.isEmpty();
	 System.out.println(b2);
	 Iterator t1=a1.iterator();
	 while(t1.hasNext())
	 {
		 t1.next();
		 Object o11=t1.next();
		 System.out.println(o11);
		 t1.remove();
	 }
	 ListIterator t2= a2.listIterator(); 
	 while(t2.hasNext())
	 {
		  t2.next();
		  Object o12=t2.next();
		  System.out.println(012);
		  t2.next();
	 }
	}
}
