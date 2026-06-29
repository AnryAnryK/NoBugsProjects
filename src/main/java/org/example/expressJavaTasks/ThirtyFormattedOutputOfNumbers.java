package org.example.expressJavaTasks;

/*
Вывести числа с 2 знаками после запятой.
 */

import java.text.DecimalFormat;

public class ThirtyFormattedOutputOfNumbers {

	// Вариант 1: просто метод, вызываемый в main
	public static float formattedOutputOfNumbers(float number) {
		return number;
	}

	// Вариант 2: С помощью DecimalFormat
	public static String formattedOutputOfNumbersWithDecimalFormat(double number) {
		DecimalFormat df = new DecimalFormat("#.00");
		return df.format(number);
	}

	public static void main(String[] args) {
		System.out.printf("%.2f", ThirtyFormattedOutputOfNumbers.formattedOutputOfNumbers(3.14F));
		System.out.println(": Вариант 1");

		System.out.print(ThirtyFormattedOutputOfNumbers.formattedOutputOfNumbersWithDecimalFormat(3.14F));
		System.out.println(": Вариант 2");

		System.out.printf("%.2f", 3.14F); // или можно просто так - без метода
		System.out.println(": Вариант 3");
	}
}
