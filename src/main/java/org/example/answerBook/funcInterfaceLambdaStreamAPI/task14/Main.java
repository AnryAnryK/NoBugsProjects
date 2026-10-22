package org.example.answerBook.funcInterfaceLambdaStreamAPI.task14;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Product tv = new Product("TV", 100.50);
		Product dvd = new Product("DVD", 130.05);

		ProductCatalog productCatalog = new ProductCatalog(List.of(tv, dvd));
		List<Product> result1 =  productCatalog.sortProductsListByPrice();
		System.out.println("Список объектов, отсортированных по цене: " + result1);

		Product apple = new Product("apple", 1.01);
		productCatalog.addProduct(apple);

		List<Product> result2 =  productCatalog.sortProductsListByPrice();
		System.out.println("Список объектов, отсортированных по цене: " + result2);
	}
}
