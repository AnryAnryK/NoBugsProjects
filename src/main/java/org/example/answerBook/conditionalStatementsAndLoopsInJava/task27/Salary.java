package org.example.answerBook.conditionalStatementsAndLoopsInJava.task27;

/*
27. Уровень зарплаты по опыту
 Вводится количество лет опыта.
До 1 года — "Junior",
1–3 — "Middle",
4–6 — "Senior",
7 и более — "Lead".
 */

public class Salary {
	public static void main(String[] args) {
		showSalaryLevelBasedOnExperience(0);
		showSalaryLevelBasedOnExperience(3);
		showSalaryLevelBasedOnExperience(5);
		showSalaryLevelBasedOnExperience(15);
	}

	public static void showSalaryLevelBasedOnExperience(int experience) {
		if (experience < 0) {
			System.out.println("Опыт не может быть отрицательным !");
			return;
		}
		if (experience < 1) {
			System.out.println("Junior");
		} else if (experience >= 1 && experience <= 3) {
			System.out.println("Middle");
		} else if (experience >= 4 && experience <= 6) {
			System.out.println("Senior");
		} else {
			System.out.println("Lead");
		}
	}
}
