package org.example.answerBook.staticFinalAccessModifiers.task1;

/*
1. Математические константы
 Разработай вспомогательный класс, который содержит два числовых значения: число Пи (3.14159) и число Эйлера (2.71828).
Эти значения не должны изменяться после объявления и должны быть доступны без создания объекта.
Добавь метод, который печатает обе константы.
Пояснение: подумай, как сделать значения "глобальными" и неизменяемыми.
 */

public class MathematicalConstants {
	public static final double PI = 3.14159;
	public static final double THE_EULER_NUMBER = 2.71828;

	public static void printNumbers() {
		System.out.println(PI);
		System.out.println(THE_EULER_NUMBER);
	}
}
