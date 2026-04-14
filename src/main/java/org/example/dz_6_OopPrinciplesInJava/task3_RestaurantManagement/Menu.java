package org.example.dz_6_OopPrinciplesInJava.task3_RestaurantManagement;

public class Menu {

	private Dishes dishes;

	public void setDish(Dishes dishes) {
		this.dishes = dishes;
	}

	public void getDish() {
		dishes.printDescription();
	}
}
