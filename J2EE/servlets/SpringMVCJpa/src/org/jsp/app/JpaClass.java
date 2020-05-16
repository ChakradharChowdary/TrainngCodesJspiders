package org.jsp.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaClass 
{
public static void add1(JpaSpring jpaSpring)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("SpringMVCJpa");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	entityManager.persist(jpaSpring);
	
	entityManager.getTransaction().commit();
	entityManager.close();
}
}
