package org.example.answerBook.collectionsInJava.task16;

/*
16. Карта цен на продукты
 Храни название продукта и его цену. Позволяй обновлять цену и получать её по имени
 */

import java.util.HashMap;
import java.util.Map;

public class Product {

	private final Map<String, Double> products = new HashMap<>();

	public void addProduct(String title, double price) {
		products.put(title, price);
	}

	public void getPriceByTitle(String title) {
		System.out.println("Цена продукта: " + products.get(title));
	}

	public void updatePrice(String title, double newPrice) {
		if (products.containsKey(title)) {
			products.put(title, newPrice);
		} else {
			throw new IllegalArgumentException("Отсутствует Товар, у которого можно поменять Цену");
		}
	}
}
