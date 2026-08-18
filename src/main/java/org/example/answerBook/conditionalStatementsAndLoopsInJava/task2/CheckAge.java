package org.example.answerBook.conditionalStatementsAndLoopsInJava.task2;

/*
2. Проверка возраста на совершеннолетие
 Вводится возраст. Выведи, совершеннолетний ли пользователь или нет.
 */

public class CheckAge {
	public static void checkingAge(int age) {
		if (age >= 18) {
			System.out.println("Возраст: " + age + " - cовершеннолетний");
		} else {
			System.out.println("Возраст: " + age + " - несовершеннолетний");
		}
	}
}
