package com.pizzamanagement.Dao;

import javax.persistence.EntityManager;

import com.pizzamanagement.model.Pizza;

public class PizzaDaoImpl implements PizzaDao{
	private EntityManager entityManager;
	
	public PizzaDaoImpl() {
		entityManager = JPAUtil.getEntityManager();//Creating object or entityManager for taking all from JPAUtil
	}

	public Pizza getPizzaByNo(int No) {
		Pizza pizza = entityManager.find(Pizza.class, No);//Find method use for fetching values
		return pizza;
	}

	public void addPizza(Pizza pizza) {
		entityManager.persist(pizza);//Use persist method for insert values
		
	}
	public void updatePizza(Pizza pizza) {
		entityManager.merge(pizza);//Use Merge Method for Update
		
	}

	public void deletePizza(Pizza pizza) {
		entityManager.remove(pizza);//Use Remove method for delete
		
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();//Ending transaction of inserting or any opertion
		
	}
	public void beginTransaction() {
		entityManager.getTransaction().begin();//Starting or begin transaction of inserting or any opertion
		
	}
	

}
