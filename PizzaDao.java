package com.pizzamanagement.Dao;

import com.pizzamanagement.model.Pizza;

public interface PizzaDao {
	//All the unimplemented method in interface 
	Pizza getPizzaByNo(int No);
	
	void addPizza(Pizza pizza);
	
	void updatePizza(Pizza pizza);
	
	void deletePizza(Pizza pizza);
	
	void commitTransaction();
	
	void beginTransaction();
	

}
