package org.example.answerBook.oopPrinciplesInJava.task11;

public class MainOperation {
	public static void main(String[] args) {
		Addition sum = new Addition();
		Subtraction sub = new Subtraction();
		Multiplication multi = new Multiplication();
		Division div = new Division();
		Calculator calculator1 = new Calculator(sum);
		Calculator calculator2 = new Calculator(sub);
		Calculator calculator3 = new Calculator(multi);
		Calculator calculator4 = new Calculator(div);
		System.out.println("Результат операции " + Addition.class.getSimpleName() + " = " + calculator1.calculate(2, 3));
		System.out.println("Результат операции " + Subtraction.class.getSimpleName() + " = " + calculator2.calculate(2, 3));
		System.out.println("Результат операции " + Multiplication.class.getSimpleName() + " = " + calculator3.calculate(2, 3));
		System.out.println("Результат операции " + Division.class.getSimpleName() + " = " + calculator4.calculate(2, 3));
	}
}
