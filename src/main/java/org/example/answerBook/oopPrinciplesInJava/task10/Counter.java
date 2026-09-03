package org.example.answerBook.oopPrinciplesInJava.task10;

/*
10. Счётчики через наследование (Переиспользование логики)
 Создай базовый класс Counter, в котором реализовано увеличение значения и получение текущего числа.
Создай наследников: StepCounter (увеличивает не на 1, а на заданный шаг), LimitedCounter (не превышает максимум).
Пояснение: пример наследования для расширения/изменения поведения базового класса без дублирования кода.
 */

public class Counter {
	private int count;

	public Counter(int count) {
		this.count = count;
	}

	public int increaseCount() {
		return ++count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
