package org.example.answerBook.problemSolving.task8;

/*
Задача 8: Конкатенация строк

Описание:
 Метод join(String a, String b) объединяет две строки. В дебаге видно, что при a == null происходит ошибка.
 */

public class StringConcatenation {

	public static String join(String a, String b) {
		if (a == null) {
			a = "";
//			throw new IllegalArgumentException("Значение a не может быть null");  // на случай обработки ошибки
		}
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(join("Место", "Поляна"));
		System.out.println(join(null, "Поляна"));
	}
}
