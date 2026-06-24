package org.example.expressJavaTasks;

/*
Написать метод деления с обработкой исключения деления на ноль.
 */

public class FourteenProcessingDivisionByZeroWithTryCatch {

	public static int processingDivisionByZero(int a, int b) {

		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("На 0 делить нельзя !");
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(FourteenProcessingDivisionByZeroWithTryCatch.processingDivisionByZero(4, 2));
		System.out.println(FourteenProcessingDivisionByZeroWithTryCatch.processingDivisionByZero(0, 2));
		System.out.println(FourteenProcessingDivisionByZeroWithTryCatch.processingDivisionByZero(2, 0));
	}
}
