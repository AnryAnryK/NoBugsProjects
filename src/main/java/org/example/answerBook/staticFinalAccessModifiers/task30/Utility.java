package org.example.answerBook.staticFinalAccessModifiers.task30;

/*
30. Утилитный класс без наследования
 Создай класс с набором вспомогательных методов (например, строковых или математических).
Класс не должен допускать создание объектов и не должен расширяться.
Пояснение: запрети наследование и создание экземпляров через комбинацию final и приватного конструктора.
 */

public final class Utility {
	private static String utilityTitle = "Мой Утилитный класс";

	private Utility() {
		throw new AssertionError("Создание экземпляра Utilite запрещено.");
	}

	public static String getUtilityTitle() {
		return utilityTitle;
	}

	public static void printUtilityTitle() {
		System.out.println(utilityTitle);
	}
}
