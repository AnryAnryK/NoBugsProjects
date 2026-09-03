package org.example.answerBook.oopPrinciplesInJava.task11;

public class Calculator {

	private Operation operation;

	public Calculator(Operation operation) {
		this.operation = operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Operation getOperation() {
		return operation;
	}

	public double calculate(double a, double b) {
		return operation.apply(a, b);
	}
}
