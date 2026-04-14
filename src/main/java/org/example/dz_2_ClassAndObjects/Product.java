package org.example.dz_2_ClassAndObjects;

public class Product {

	/*
	Класс Product
Создайте класс Product с полями name и price. Реализуйте конструктор, геттеры, сеттер для цены,
метод applyDiscount(discount) для применения скидки, и метод printInfo(),
выводящий информацию о товаре и цене.

В main измените цену, примените скидку и выведите цену.
	 */

	public static void main(String[] args) {
		Product product1 = new Product("Компьютер", 1500);
		product1.printInfo();
		product1.applyDiscount(25);
		product1.printInfo();
	}

	private String name;
	private double price;

	Product(String newName, double newPrice) {
		this.name = newName;
		this.price = newPrice;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public double applyDiscount(double discount) {
		return price - (price * discount / 100);
	}

	public void printInfo() {
		System.out.println("Название товара : " + getName());
		System.out.println("Цена товара : " + getPrice());
	}

}
