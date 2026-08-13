package org.example.answerBook.complexJavaTasks.task4;

/*
Магазин с корзиной покупок
 Реализуй классы Product, Cart, ShopSystem.
 В корзину можно добавлять продукты, изменять их количество и вычислять общую стоимость. Добавь проверку на наличие товара и скидки
 */

public class MainTask4 {

	public static void main(String[] args) {
		ShopSystem shopSystem1 = new ShopSystem();

		Product product1 = new Product("Блокнот", 10.0, 1);
		Product product2 = new Product("Карандаш", 20.0, 1);
		Product product3 = new Product("Ручка", 30.0, 1);
		Product product4 = new Product("Линейка", 40.0, 2);

		shopSystem1.fillingCart(product1);
		shopSystem1.fillingCart(product2);
		shopSystem1.fillingCart(product3);
		shopSystem1.fillingCart(product4);

		Cart cart1 = shopSystem1.getCart();
		cart1.showProductsInfo();

		System.out.println(shopSystem1.getCart().getTotalSumOfProducts());
		System.out.println(shopSystem1.getCart().getTotalSumOfProductsWithDiscount());
	}
}
