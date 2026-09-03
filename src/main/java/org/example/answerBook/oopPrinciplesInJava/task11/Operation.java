package org.example.answerBook.oopPrinciplesInJava.task11;

/*
11. Калькулятор со стратегиями (Абстракция + Стратегия)
 Создай интерфейс Operation с методом double apply(double a, double b).
Реализуй классы Addition, Subtraction, Multiplication, Division.
Создай Calculator, в который можно "подключить" нужную операцию и вызвать calculate(a, b).
Пояснение: демонстрация абстракции и замены поведения без изменения логики самого калькулятора.
 */

public interface Operation {
	public double apply(double a, double b);
}
