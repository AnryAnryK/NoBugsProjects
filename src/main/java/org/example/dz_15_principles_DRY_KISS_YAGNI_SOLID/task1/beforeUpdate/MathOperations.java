package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task1.beforeUpdate;

/*
1. Нарушение DRY (Don't Repeat Yourself) – дублирование кода
Задача: Устраните дублирование кода, применив перегрузку методов или использование массива аргументов.
 */

public class MathOperations {
	public int add(int a, int b) {
		return a + b;
	}
	public int addThreeNumbers(int a, int b, int c) {
		return a + b + c;
	}
	public int addFourNumbers(int a, int b, int c, int d) {
		return a + b + c + d;
	}
}
