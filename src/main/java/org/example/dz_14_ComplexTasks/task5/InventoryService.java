package org.example.dz_14_ComplexTasks.task5;

import java.util.*;

public class InventoryService {
	private final Map<String, List<Product>> listOfProducts1 = new HashMap<>();
	private boolean isInventoryOpen = true;

	public void getFlagSsInventoryOpen(boolean isInventoryOpen) {
		this.isInventoryOpen = isInventoryOpen;
	}

	public synchronized Product addProduct(Product product) throws OutOfStockException {
		if (!isInventoryOpen) {
			throw new OutOfStockException("Флаг isInventoryOpen равен false, операция добавления не должна выполняться");
		}
		String category = product.getProductCategory();
		listOfProducts1.computeIfAbsent(category, k -> new ArrayList<>()).add(product);
		return product;
	}

	public Product getProductByCategory(String productCategory) throws OutOfStockException {
		List<Product> products = listOfProducts1.getOrDefault(productCategory, Collections.emptyList());
		if (products.isEmpty() || products == null) {
			throw new OutOfStockException("В указанной категории нет товаров");
		}
		return products.remove(0);
	}

	public Product findAndGetProductByCategoryFiltersStreamApi(Product product) {
		listOfProducts1.get(product.getProductCategory())
				.stream()
				.filter(x -> x.getProductCategory()
						.equals(product.getProductCategory()));
		return product;
	}

	public Product findAndGetProductByPriceFiltersStreamApi(Product product) {
		double targetPrice = product.getProductPrice();

		return listOfProducts1.values().stream()
				.flatMap(List::stream)
				.filter(x -> x.getProductPrice().equals(targetPrice))
				.findFirst()
				.orElse(null);
	}
}
