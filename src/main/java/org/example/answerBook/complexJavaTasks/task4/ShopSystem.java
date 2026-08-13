package org.example.answerBook.complexJavaTasks.task4;

public class ShopSystem {

	private Cart cart;

	public ShopSystem() {
		this.cart = new Cart();
	}

	public void fillingCart(Product product) {
		cart.addProduct(product);
	}

	public Cart getCart() {
		return cart;
	}
}
