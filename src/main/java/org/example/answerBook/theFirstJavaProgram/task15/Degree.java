package org.example.answerBook.theFirstJavaProgram.task15;

/*
15. Степень
Метод power(double base, double exponent) возвращает Math.pow(base, exponent).
 */

public class Degree {

	public static double power(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	public static void main(String[] args) {
		System.out.println(power(122, 2));
	}
}
