package org.example.expressJavaTasks;

/*
Написать метод деления с обработкой исключения деления на ноль.
 */

public class FourteenProcessingDivisionByZero {

	public static int processingDivisionByZero(int a, int b) {

		if (a == 0 || b == 0) {
			throw new ArithmeticException("На 0 делить нельзя !");
		}
		return a / b;
	}

	public static void main(String[] args) {
		System.out.println(FourteenProcessingDivisionByZero.processingDivisionByZero(4, 2));
		System.out.println(FourteenProcessingDivisionByZero.processingDivisionByZero(0, 2));
		System.out.println(FourteenProcessingDivisionByZero.processingDivisionByZero(2, 0));
	}
}
