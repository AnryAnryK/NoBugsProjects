package org.example.answerBook.theFirstCreationOfClassesAndObjects.task21;

/*
21. Класс ShopItem
 Создай класс ShopItem с полями price (double) и discount (int в процентах).
Метод getFinalPrice() должен возвращать цену с учётом скидки.
Подсказка: формула price * (100 - discount) / 100.0.
 */

public class ShopItem {
	private double price;
	private int discount;

	public ShopItem(double price, int discount) {
		this.price = price;
		this.discount = discount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getFinalPrice() {
		return price * (100 - discount) / 100.0;
	}
}
