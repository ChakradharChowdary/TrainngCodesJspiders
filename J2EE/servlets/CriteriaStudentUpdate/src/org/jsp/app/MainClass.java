package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

public class MainClass 
{
	public static void main(String[] args)
	 {
		Scanner scanner=new Scanner(System.in);
		int option=0;
		System.out.println("Enter 1 for Updating all the records ");
		System.out.println("Enter 2 for Update  name of the perticular record" );
		System.out.println("Enter 3 for Update dept the 3 records");
		
		int opt=scanner.nextInt();
		
		switch(opt)
		{
		case 1:
			update();
			break;
		case 2:
			update1();
			break;
		case 3:
			update2();
			break;
			default:
				System.out.println("Invalid Option");
		}
	}

public static void update()
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CriteriaStudentUpdate");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();

			
			
	CriteriaBuilder builder=entityManager.getCriteriaBuilder();
	CriteriaUpdate update=builder.createCriteriaUpdate(null);
	
	Query query=entityManager.createQuery("");
	query.executeUpdate();
	
	entityManager.getTransaction().commit();
	entityManager.close();

}
public static void update1()
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CriteriaStudentUpdate");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	CriteriaBuilder builder=entityManager.getCriteriaBuilder();

	
	Query query=entityManager.createQuery("");
	query.executeUpdate();
	
	
	entityManager.getTransaction().commit();
	entityManager.close();
	
}
public static void update2()
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CriteriaStudentUpdate");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	
	CriteriaBuilder builder=entityManager.getCriteriaBuilder();

	Query query=entityManager.createQuery("");
	query.executeUpdate();
	
	
	entityManager.getTransaction().commit();
	entityManager.close();
	
}
}
