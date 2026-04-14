package org.example.dz_6_OopPrinciplesInJava.task3_RestaurantManagement;

public class Drink extends Dishes {

	double volume; // милилитры
	private Dishes drink;

	Drink(double volume) {
		this.volume = volume;
	}

	@Override
	public void printDescription() {
		System.out.println("Напиток ");
	}
}
