package com.pizzamanagement.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	static {
		factory = Persistence.createEntityManagerFactory("Rangnath");
		
	}
	public static EntityManager getEntityManager()
	{
		if(entityManager == null || !entityManager.isOpen()) {
		entityManager = factory.createEntityManager();	
		}
		return entityManager;
	}

}
