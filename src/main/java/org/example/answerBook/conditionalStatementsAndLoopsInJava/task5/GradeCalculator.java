package org.example.answerBook.conditionalStatementsAndLoopsInJava.task5;

/*
5. Оценка по баллам
 На вход подаётся число от 0 до 100. Выведи оценку по шкале:
90–100 — "Отлично",
75–89 — "Хорошо",
50–74 — "Удовлетворительно",
меньше 50 — "Неудовлетворительно".
 */

public class GradeCalculator {
	public static void gradeNumber(int number) {
		if (number >= 90 && number <= 100) {
			System.out.println("Оценка: " + number + " - Отлично");
		} else if (number >= 75) {
			System.out.println("Оценка: " + number + " - Хорошо");
		} else if (number >= 50) {
			System.out.println("Оценка: " + number + " - Удовлетворительно");
		} else
			System.out.println("Оценка: " + number + " - Неудовлетворительно");
	}
}
