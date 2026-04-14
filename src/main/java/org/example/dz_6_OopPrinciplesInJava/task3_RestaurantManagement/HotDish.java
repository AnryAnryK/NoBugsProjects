package org.example.dz_6_OopPrinciplesInJava.task3_RestaurantManagement;

public class HotDish extends Dishes {

	double temperature; // градусы цельсия
	private Dishes hotDish;

	HotDish(double temperature) {
		this.temperature = temperature;
	}


	@Override
	public void printDescription() {
		System.out.println("Горячее блюдо ");
	}
}
