package org.example.answerBook.staticFinalAccessModifiers.task11;

/*
11. Генерация уникального ID
 Создай класс Order, каждый объект которого при создании автоматически получает уникальный числовой идентификатор (например, 1, 2, 3, ...).
ID должен быть доступен только для чтения и не изменяться после присвоения.
Класс должен хранить и увеличивать счётчик самостоятельно.
Пояснение: реализуй механизм автогенерации значения, доступного каждому объекту, но основанного на общей для класса информации.
 */

public class Order {
	private static int count = 1;
	private final int id;

	public Order() {
		this.id = count++;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Создан заказ с уникальным номером: " + id;
	}
}
