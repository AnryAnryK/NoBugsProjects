package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task1.afterUpdate;

/*
1. Нарушение DRY (Don't Repeat Yourself) – дублирование кода
Задача: Устраните дублирование кода, применив перегрузку методов или использование массива аргументов.
 */

public class MathOperations {

	public int addAnyNumbers(int... numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		return sum;
	}


	public static void main(String[] args) {
		MathOperations mathOperations1 = new MathOperations();

		System.out.println("Сумма чисел равна: " + mathOperations1.addAnyNumbers(1));
		System.out.println("Сумма чисел равна: " + mathOperations1.addAnyNumbers(1, 2));
		System.out.println("Сумма чисел равна: " + mathOperations1.addAnyNumbers(1, 2, 3));
		System.out.println("Сумма чисел равна: " + mathOperations1.addAnyNumbers(1, 2, 3, 4));
	}
}
