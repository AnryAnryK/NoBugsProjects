package org.example.dz_6_OopPrinciplesInJava.task3_RestaurantManagement;

public class Main {

	public static void main(String[] args) {
		Menu menu1 = new Menu();
		Dishes hotDish1 = new HotDish(60.5);
		Dishes hotDish2 = new HotDish(71.25);
		Dishes drink1 = new Drink(200);

		menu1.setDish(hotDish1);
		menu1.getDish();

		menu1.setDish(hotDish2);
		menu1.getDish();

		menu1.setDish(drink1);
		menu1.getDish();
	}
}
