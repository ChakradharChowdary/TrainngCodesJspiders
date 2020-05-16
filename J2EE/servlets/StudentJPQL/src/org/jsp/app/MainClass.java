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
		case 2:
			read();
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
			default:
				System.out.println("Invalid Option");
		}
	}

public static void insert()
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("StudentJPQL");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	String jpql="insert into STUDetails values(?1,?2,?3)";
	
	Query query=entityManager.createQuery(jpql);
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter regNum");
	int regNum=scanner.nextInt();
	query.setParameter(1, regNum);
	System.out.println("Enter marks");
	double marks=scanner.nextDouble();
	query.setParameter(2, marks);
	System.out.println("Enter Name");
	String name=scanner.next();
	query.setParameter(3, name);
	query.executeUpdate();
	entityManager.getTransaction().commit();
	entityManager.close();
	scanner.close();
}
public static void update()
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("StudentJPQL");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	entityManager.getTransaction().commit();
	entityManager.close();
}
public static void delete()
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("StudentJPQL");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	entityManager.getTransaction().commit();
	entityManager.close();
}
public static void read()
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("StudentJPQL");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	entityManager.getTransaction().commit();
	entityManager.close();
}

}
