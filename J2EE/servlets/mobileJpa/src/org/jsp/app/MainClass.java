package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MainClass 
{
 public static void main(String[] args)
 {
	Scanner scanner=new Scanner(System.in);
	int option=0;
	System.out.println("Enter 1 for insert");
	System.out.println("Enter 2 for Read");
	System.out.println("Enter 3 for Update");
	System.out.println("Enter 4 for Remove");
	int opt=scanner.nextInt();
	
	switch(opt)
	{
	case 1:
		insert();
		break;
	case 2:
		read();
		break;
	case 3:
		update();
		break;
	case 4:
		remove();
		break;
		default:
			System.out.println("Invalid Option");
	}
}

public static void insert()
 {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mobileJpa");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	MobileFeature mf=new MobileFeature();
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter IMEI NUMBER");
	mf.setIMEI(scan.next());
	System.out.println("Enter COLOUR");
	mf.setColour(scan.next());
	System.out.println("Enter Cost");
	mf.setCost(scan.nextDouble());
	entityManager.persist(mf);
	entityManager.getTransaction().commit();
	entityManager.close();
}
public static void read()
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mobileJpa");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter IMEI Number");
	MobileFeature mobileFeature=entityManager.find(MobileFeature.class,scan.next());
	System.out.println(mobileFeature);
	entityManager.getTransaction().commit();
	entityManager.close();
}
public static void update()
{
	EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("mobileJpa");
	EntityManager  entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter IMEI Number");
	MobileFeature mobileFeature=entityManager.find(MobileFeature.class,scan.next());
	System.out.println(mobileFeature);
	System.out.println("Enter the String to update");
	mobileFeature.setColour(scan.next());
	
	entityManager.getTransaction().commit();
	entityManager.close();
}
public static void remove()
{
	EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("mobileJpa");
	EntityManager  entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter IMEI Number");
	MobileFeature mobileFeature=entityManager.find(MobileFeature.class,scan.next());
	System.out.println(mobileFeature);
	entityManager.remove(mobileFeature);
	
	entityManager.getTransaction().commit();
	entityManager.close();
}
}
