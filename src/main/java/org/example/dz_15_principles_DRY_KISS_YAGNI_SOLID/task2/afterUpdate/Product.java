package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task2.afterUpdate;

public class Product {
	private double price;
	private String title;

	public Product(double price, String title) {
		this.price = price;
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}
}
