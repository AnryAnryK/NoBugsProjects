package org.example.answerBook.oopPrinciplesInJava.task6;

import java.util.List;

public class Developer extends Employee {
	private static final double DEVELOPER_SALARY_RATIO = 2.5;


	@Override
	public double calculateSalary() {
		return SALARY * DEVELOPER_SALARY_RATIO;
	}
}
