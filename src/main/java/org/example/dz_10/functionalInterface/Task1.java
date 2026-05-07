package org.example.dz_10.functionalInterface;

public class Task1 {
	/*
	1. Создайте свой функциональный интерфейс
Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.
	 */

	public static void main(String[] args) {
		MathOperation sum = (int a, int b) -> a + b;
		System.out.println("Результат сложения двух чисел = " + sum.app(2, 4));

		MathOperation minus = (int a, int b) -> a - b;
		System.out.println("Результат вычитания двух чисел = " + minus.app(11, 4));

		MathOperation multiply = (int a, int b) -> a * b;
		System.out.println("Результат умножения двух чисел = " + multiply.app(3, 4));

		MathOperation divide = (int a, int b) -> a / b;
		System.out.println("Результат деленияния двух чисел = " + divide.app(12, 4));
	}
}


interface MathOperation {
	int app(int a, int b);
}
