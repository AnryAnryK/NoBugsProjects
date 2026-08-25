package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task4.afterUpdate;

/*
4. Нарушение SRP (Single Responsibility Principle) – класс выполняет несколько задач
Задача: Разделите класс Order на отдельные классы, каждый из которых выполняет только одну задачу.
 */

public class Order {
	private int orderNumber;
	private String title;

	public Order(int orderNumber, String title) {
		this.orderNumber = orderNumber;
		this.title = title;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public String getTitle() {
		return title;
	}
}
