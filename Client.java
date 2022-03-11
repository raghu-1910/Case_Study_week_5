package com.pizzamanagement.Ui;

import com.pizzamanagement.model.Pizza;
import com.pizzamanagement.service.PizzaService;
import com.pizzamanagement.service.PizzaServiceImpl;

public class Client {
	public static void main(String[] args) {
		PizzaService serv = new PizzaServiceImpl();
		
		Pizza pizza = new Pizza(675,"cheez_pizza",897,"delhi");
//****************Insert the values****************************
	//	serv.addPizza(pizza);
		//System.out.println("Value inserted:");
		
//*****************Fetching the record*************************
//		pizza = serv.findPizzaByNo(675);
//		System.out.println("Pizza No :"+pizza.getPizzaNo());
//		System.out.println("Pizza Name :"+pizza.getPizzaType());
//		System.out.println("Pizza Price :"+pizza.getPizzaPrice());
//		System.out.println("Pizza Delivery Address :"+pizza.getDeliveryAdd());
//		
//********************Update detail in Record*************************
//		pizza.setPizzaType("Veg pizza!");
//		pizza.setPizzaPrice(643);
//		pizza.setDeliveryAdd("jaipur");
//		System.out.println("Data Updated!");
		
//******************Delete data ******************************************
		serv.deletePizza(pizza);
		System.out.println("Deleting the data!");
				
				
	}

}
