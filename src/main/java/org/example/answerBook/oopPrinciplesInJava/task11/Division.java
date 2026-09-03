package org.example.answerBook.oopPrinciplesInJava.task11;

public class Division implements Operation {
	@Override
	public double apply(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("На 0 делить нельзя !");
		}
		return a / b;
	}
}
