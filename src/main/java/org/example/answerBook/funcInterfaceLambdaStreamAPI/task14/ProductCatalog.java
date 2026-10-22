package org.example.answerBook.funcInterfaceLambdaStreamAPI.task14;

/*
14. Сортировка объектов по полю
 Отсортируй список Product по цене по возрастанию.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductCatalog {
	private List<Product> productCatalogs;

	public ProductCatalog(List<Product> productCatalogs) {
		this.productCatalogs = new ArrayList<>(productCatalogs);
	}

	public void addProduct(Product productCatalog) {
		productCatalogs.add(productCatalog);
	}

	public List<Product> sortProductsListByPrice() {
		return productCatalogs.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "ProductCatalog{" + productCatalogs +
				'}';
	}
}
