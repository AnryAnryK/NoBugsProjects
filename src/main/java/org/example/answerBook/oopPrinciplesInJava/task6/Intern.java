package org.example.answerBook.oopPrinciplesInJava.task6;

import java.util.List;

public class Intern extends Employee {
	private static final double INTERN_SALARY_RATIO = 0.5;


	@Override
	public double calculateSalary() {
		return SALARY * INTERN_SALARY_RATIO;
	}
}
