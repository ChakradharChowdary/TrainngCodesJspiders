package org.jsp.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPACode 
{
private static Object festName1;
private static String festDT;
private static Object fname1;
private static Object festName2;
public static void saveFestival(Festival festival)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JpaPrg2");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	entityManager.persist(festival);
	
	entityManager.getTransaction().commit();
	entityManager.close();
}
public static void readFestival(Festival fest2) 
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JpaPrg2");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	Festival festival=entityManager.find(Festival.class, fname1);
	System.out.println(festival);
	
	entityManager.getTransaction().commit();
	entityManager.close();
}
public static void updateFestival(Festival festival1)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JpaPrg2");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	Festival festival=entityManager.find(Festival.class, festName1);
	System.out.println(festival);
	festival.setFestivalType(festDT);
	
	entityManager.getTransaction().commit();
	entityManager.close();
}
public static void removeFestival(Festival festival3)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JpaPrg2");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin(); 
	
	Festival festival=entityManager.find(Festival.class, festName2);
	System.out.println(festival);
	entityManager.remove(festival);
	
	entityManager.getTransaction().commit();
	entityManager.close();
}

}
