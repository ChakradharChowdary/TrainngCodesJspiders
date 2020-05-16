\package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass 
{
 public static void main(String[] args) 
 {
	EntityManagerFactory ref1=Persistence.createEntityManagerFactory("JpaMobile");
	EntityManager ref2=ref1.createEntityManager();
	
	Mobile  mobile=new Mobile();
	Scanner  scanner=new  Scanner(System.in);
	System.out.println("Enter IMEI Number");
	mobile.setEIMI(scanner.next());
	System.out.println("Enter Colour");
	mobile.setColour(scanner.next());
	System.out.println("Enter Cost");
	mobile.setCost(scanner.nextDouble());
	
	entityManager.persist(mobile);
	ref2.getTransaction().commit();
	ref2.close();
	
}
}
