package org.employee.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeePersistance 
{
public static void add1(Employee employee)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("EmployeeManagement");
	EntityManager  entityManager= entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	entityManager.persist(employee);
	
	entityManager.getTransaction().commit();
	entityManager.close();
}
public static void search1(Employee employee)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("EmployeeManagement");
	EntityManager  entityManager= entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	Employee getEmployee=entityManager.find(Employee.class,employee.getPhoneNumber());
	
	System.out.println(getEmployee);

	
	entityManager.getTransaction().commit();
	entityManager.close();
}

public static void remove1(Employee employee)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("EmployeeManagement");
	EntityManager  entityManager= entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	Employee removeEmployee=entityManager.find(Employee.class,employee.getPhoneNumber());
	System.out.println(removeEmployee);
	
	entityManager.remove(removeEmployee);
	
	entityManager.getTransaction().commit();
	entityManager.close();
}

}
