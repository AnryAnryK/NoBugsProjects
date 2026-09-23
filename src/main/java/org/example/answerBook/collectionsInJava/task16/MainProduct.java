package org.example.answerBook.collectionsInJava.task16;

public class MainProduct {
	public static void main(String[] args) {
		Product product = new Product();
		product.addProduct("Банан", 100.5);
		product.getPriceByTitle("Банан");

		product.updatePrice("Банан", 200.1);
		product.getPriceByTitle("Банан");

		product.updatePrice("Бан", 200.1);
		product.getPriceByTitle("Банан");
	}
}
