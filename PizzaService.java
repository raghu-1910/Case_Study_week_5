package com.pizzamanagement.service;

import com.pizzamanagement.model.Pizza;

public interface PizzaService {
	//Creata method which we want to perform
	void addPizza(Pizza pizza);
	void updatePizza(Pizza pizza);
	void deletePizza(Pizza pizza);
	Pizza findPizzaByNo(int No);

}
