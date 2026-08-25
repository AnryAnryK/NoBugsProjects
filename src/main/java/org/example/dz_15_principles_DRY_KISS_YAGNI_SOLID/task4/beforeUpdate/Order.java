package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task4.beforeUpdate;

/*
4. Нарушение SRP (Single Responsibility Principle) – класс выполняет несколько задач
Задача: Разделите класс Order на отдельные классы, каждый из которых выполняет только одну задачу.
 */

public class Order {
	public void processOrder() {
		System.out.println("Обрабатываем заказ...");
	}

	public void sendEmailConfirmation() {
		System.out.println("Отправляем письмо клиенту...");
	}

	public void generateInvoice() {
		System.out.println("Генерируем счет...");
	}
}
