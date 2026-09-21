package org.example.answerBook.collectionsInJava.task15;

public class MainProductsWithoutRepetition {
	public static void main(String[] args) {
		ProductsWithoutRepetition productsWithoutRepetition = new ProductsWithoutRepetition();
		System.out.println(productsWithoutRepetition.addGoodIfAbsent("Тапки"));
		System.out.println(productsWithoutRepetition.addGoodIfAbsent("Маска"));
		System.out.println(productsWithoutRepetition.addGoodIfAbsent("Полотенце"));
		System.out.println(productsWithoutRepetition.addGoodIfAbsent("Тапки"));
	}
}
