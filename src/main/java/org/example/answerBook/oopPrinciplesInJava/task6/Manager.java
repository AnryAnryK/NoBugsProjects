package org.example.answerBook.oopPrinciplesInJava.task6;

public class Manager extends Employee {
	private static final double MANAGER_SALARY_RATIO = 3.5;

	@Override
	public double calculateSalary() {
		return SALARY * MANAGER_SALARY_RATIO;
	}
}
