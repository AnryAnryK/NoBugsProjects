package org.example.answerBook.theFirstCreationOfClassesAndObjects.task13;

/*
13. Класс Pen
 Определи класс Pen с полем color (String).
Метод write(String text) выводит: <color> ручка пишет: <text>.
Создай несколько объектов с разными цветами.
 */

public class Pen {
	private String color;

	public Pen(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void write(String text) {
		System.out.println("\"" + getColor() + "\" ручка пишет: \"" + text + "\"");
	}
}
