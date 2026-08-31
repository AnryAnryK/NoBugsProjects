package org.example.answerBook.oopPrinciplesInJava.task5;

/*
5. Фигуры и площадь (Абстракция через абстрактный класс)
 Создай абстрактный класс Shape с методом double getArea().
 Создай наследников: Circle, Rectangle, Triangle. У каждого — реализация метода getArea() по формуле.
Реализуй метод printArea(Shape s), который выводит результат.
Пояснение: абстракция через общий интерфейс, позволяющий работать с разными реализациями единообразно.
 */

public abstract class Shape {
	public abstract double getArea();

	public void printArea(Shape s){
		System.out.println("Площадь фигуры: " + s.getClass().getSimpleName() + " = " + s.getArea());
	}
}
