package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
			default:
				System.out.println("Invalid Option");
		}
	}

public static void insert()
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CROPDetails");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	String jpql="Update Crop set MONTHS=4 where NAME=paddy";
	System.out.println("1");
	Query query=entityManager.createQuery(jpql);
	query.executeUpdate();
	System.out.println("2");
	entityManager.getTransaction().commit();
	entityManager.close();
	
}


}
