package com.pizzamanagement.service;

import com.pizzamanagement.Dao.PizzaDao;
import com.pizzamanagement.Dao.PizzaDaoImpl;
import com.pizzamanagement.model.Pizza;

public class PizzaServiceImpl implements PizzaService {//using implements for inherit interface here
	private PizzaDao PDao;
	
	public PizzaServiceImpl()
	{
		PDao = new PizzaDaoImpl();//Creating Dao Object using dao implemention
	}
	//Adding details of pizza method
	public void addPizza(Pizza pizza) {
		PDao.beginTransaction();
		PDao.addPizza(pizza);
		PDao.commitTransaction();
		
	}
	//Update details method
	public void updatePizza(Pizza pizza) {
		PDao.beginTransaction();
		PDao.updatePizza(pizza);
		PDao.commitTransaction();
		
	}
	//Delete item method
	public void deletePizza(Pizza pizza) {
		PDao.beginTransaction();
		PDao.deletePizza(pizza);
		PDao.commitTransaction();
		
	}
	@Override
	//fetching results using find
	public Pizza findPizzaByNo(int No) {
		//Here no need of Transaction its for reading purpose only
		Pizza pizza = PDao.getPizzaByNo(No);
		return pizza;
		
	}

	
}
