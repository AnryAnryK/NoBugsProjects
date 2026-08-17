package org.example.answerBook.theFirstCreationOfClassesAndObjects.task6;

/*
6. Класс Circle
 Создай класс Circle, описывающий круг.
Поле: radius (тип double).
Метод getArea() должен возвращать площадь круга по формуле Math.PI * r * r.
Подсказка: используй библиотеку Math.
 */

public class Circle {
	private double radius;

	Circle(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Радиус не может быть меньше или равен 0");
		}
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}
