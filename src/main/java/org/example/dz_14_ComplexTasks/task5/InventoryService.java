package org.example.dz_14_ComplexTasks.task5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {

	Map<String, List<Product>> listOfProducts1 = new HashMap<>();
	boolean isInventoryOpen = true;

	public Product addProduct(Product product) throws OutOfStockException {

		if (!isInventoryOpen) {
			throw new OutOfStockException("Флаг isInventoryOpen равен false, операция добавления не должна выполняться");
		}
		product.getProductName();
		product.getProductPrice();
		product.getProductCategory();
		return product;
	}

	public Product getProductByCategory(Product product) throws OutOfStockException {
		if (product.getProductCategory().isEmpty() || product.getProductCategory() == null) {
			throw new OutOfStockException("В указанной категории нет товаров");
		}
		product.getProductCategory();
		return product;
	}
}
