package org.example.answerBook.theFirstCreationOfClassesAndObjects.task3;

/*
3. Класс Phone
 Реализуй класс Phone с полями model (тип String) и batteryLevel (тип int).
Добавь метод call(String number), который выводит: Звоню на номер <number> с телефона <model>.
Подсказка: в main() создай объект и вызови метод.
 */

public class Phone {
	private String model;
	private int batteryLevel;

	Phone(String model, int batteryLevel) {
		this.model = model;
		this.batteryLevel = batteryLevel;
	}

	public void call(String number) {
		System.out.println("Звоню на номер \"" + number + "\" с телефона \"" + model);
	}

	public static void main(String[] args) {
		Phone phone1 = new Phone("Ё-мобильный", 28);
		phone1.call("+122-233-445");
	}
}
