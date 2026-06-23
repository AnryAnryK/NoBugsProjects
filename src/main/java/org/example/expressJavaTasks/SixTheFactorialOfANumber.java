package org.example.expressJavaTasks;

public class SixTheFactorialOfANumber {

	public static int theFactorialOfANumber(int num) {

		int factorial = 1;
		if (num <= 0) {
			throw new IllegalArgumentException("Нельзя считать факториал от 0 и отрицательных чисел");
		}

		for (int i = 2; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println(SixTheFactorialOfANumber.theFactorialOfANumber(6));
		System.out.println(SixTheFactorialOfANumber.theFactorialOfANumber(0));
		System.out.println(SixTheFactorialOfANumber.theFactorialOfANumber(-10));
	}
}
