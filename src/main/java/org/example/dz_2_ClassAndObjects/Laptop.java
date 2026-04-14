package org.example.dz_2_ClassAndObjects;

public class Laptop {

	/*
	Класс Laptop
Создайте класс Laptop с полями brand и price. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
выводящий информацию о ноутбуке и его цене.

В main измените цену и выведите информацию.
	 */
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop("Китайщина", 200);
		laptop1.printInfo();
		laptop1.setPrice(210);
		laptop1.printInfo();
	}


	private String brand;
	private double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Laptop(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public void printInfo() {
		System.out.println("Название бренда : " + getBrand());
		System.out.println("Цена товара : " + getPrice());
	}

}
