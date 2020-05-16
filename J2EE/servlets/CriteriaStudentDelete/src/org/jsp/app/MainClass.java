package org.jsp.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;

	public class MainClass
		{
			public static void main(String[] args)
			 {
				Scanner scanner=new Scanner(System.in);
				int option=0;
				System.out.println("Enter 1 for deleting student details where marksbetween 35 to 65  ");
				System.out.println("Enter 2 for deleting  two student details" );
				System.out.println("Enter 3 deleting student details where marks >70");
				
				int opt=scanner.nextInt();
				
				switch(opt)
				{
				case 1:
					delete();
					break;
				case 2:
					delete1();
					break;
				case 3:
					delete2();
					break;
					default:
						System.out.println("Invalid Option");
				}
			}
	
		public static void delete()
		{
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CriteriaStudent");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
	
					
					
			CriteriaBuilder builder=entityManager.getCriteriaBuilder();
			CriteriaDelete<Student> delete=builder.createCriteriaDelete(Student.class);
			Root<Student> root=delete.from(Student.class);
			Scanner  scanner=new Scanner(System.in);

			System.out.println("Enter the ranges N between M");
			
			delete.where(builder.between(root.get("marks"),scanner.nextDouble(), scanner.nextDouble()));
			
			Query query=entityManager.createQuery(delete);
			query.executeUpdate();
			
			entityManager.getTransaction().commit();
			entityManager.close();
			scanner.close();
		}
		public static void delete1()
		{
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CriteriaStudent");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			
			CriteriaBuilder builder=entityManager.getCriteriaBuilder();
			CriteriaDelete<Student> delete=builder.createCriteriaDelete(Student.class);
			Root<Student> root=delete.from(Student.class);
			Scanner  scanner=new Scanner(System.in);
			System.out.println("Enter the two records names");
			
			delete.where(builder.in(root.get("marks")));
			
			
			Query query=entityManager.createQuery(delete);
			query.executeUpdate();
			
			
			entityManager.getTransaction().commit();
			entityManager.close();
			
		}
		public static void delete2()
		{
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("CriteriaStudent");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			
			
			CriteriaBuilder builder=entityManager.getCriteriaBuilder();
			CriteriaDelete<Student> delete=builder.createCriteriaDelete(Student.class);
			Root<Student> root=delete.from(Student.class);
			Scanner  scanner=new Scanner(System.in);
			System.out.println("Enter the greater value");
			delete.where(builder.greaterThan(root.get("marks"),scanner.nextDouble()));
			Query query=entityManager.createQuery(delete);
			query.executeUpdate();
			
			
			entityManager.getTransaction().commit();
			entityManager.close();
			
		}
	}
