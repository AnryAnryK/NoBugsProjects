package org.example.answerBook.staticFinalAccessModifiers.task11;

public class MainOrder {
	public static void main(String[] args) {
		Order order1 = new Order();
		System.out.println(order1);

		Order order2 = new Order();
		System.out.println("Создан заказ с уникальным номером: " + order2.getId());

		Order order3 = new Order();
		System.out.println(order3);
	}
}
