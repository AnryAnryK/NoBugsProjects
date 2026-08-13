package org.example.answerBook.complexJavaTasks.task4;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> listOfProducts = new ArrayList<>();

	private static final double RULER_DISCOUNT_PERCENT = 0.10;
	private static final String RULER = "Линейка";

	public void addProduct(Product product) {
		for (Product p : listOfProducts) {
			if (p.getProductName().equals(product.getProductName())) {
				p.setProductCount(p.getProductCount() + product.getProductCount());
				System.out.println("Продукт: " + product.getProductName() + " - обновлено количество (" + p.getProductCount() + ")");
				return;
			}
		}
		listOfProducts.add(product);
		System.out.println("Продукт: " + product.getProductName() + " - добавлен в Корзину");
	}

	public void removeProduct(Product product) {
		for (Product p : listOfProducts) {
			if (p.getProductName().equals(product.getProductName())) {
				if (p.getProductCount() > 1) {
					p.setProductCount(p.getProductCount() - 1);
					System.out.println("Уменьшено количество " + p.getProductName() + ". Осталось: " + p.getProductCount());
				} else {
					listOfProducts.remove(p);
					System.out.println("Продукт: " + product.getProductName() + " - удалён из Корзины");
				}
				return;
			}
		}
		System.out.println("Товар '" + product.getProductName() + "' не найден в корзине.");
	}

	public void showProductsInfo() {
		for (Product allProducts : listOfProducts) {
			System.out.println("В Корзине находятся следующие Товары : " + allProducts.getProductName() + "; " + "Количество товара: " + allProducts.getProductCount() + "; " + "Цена товара: " + allProducts.getProductPrice());
		}
	}

	public boolean checkingProductByName(String name) {
		for (Product p : listOfProducts) {
			if (p.getProductName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public double getTotalSumOfProducts() {
		double totalSum = 0;
		for (Product p : listOfProducts) {
			totalSum = totalSum + p.getProductCount() * p.getProductPrice();
		}
		return totalSum;
	}

	public double getTotalSumOfProductsWithDiscount() {
		double totalSum = 0;
		for (Product p : listOfProducts) {
			double currentSum = p.getProductCount() * p.getProductPrice();

			if (p.getProductName().equalsIgnoreCase(RULER)) {
				currentSum = currentSum * (1 - RULER_DISCOUNT_PERCENT);
			}
			totalSum = totalSum + currentSum;
		}
		return totalSum;
	}
}
