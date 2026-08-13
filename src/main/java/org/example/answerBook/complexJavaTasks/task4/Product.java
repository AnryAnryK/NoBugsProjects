package org.example.answerBook.complexJavaTasks.task4;

import java.util.Objects;

public class Product {

	private final String productName;
	private final double productPrice;
	private int productCount;


	public Product(String productName, double productPrice, int productCount) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCount = productCount;
	}

	public String getProductName() {
		return productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return Double.compare(productPrice, product.productPrice) == 0 && Objects.equals(productName, product.productName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(productName, productPrice);
	}
}
