package org.example.answerBook.oopPrinciplesInJava.task6;

import java.util.ArrayList;
import java.util.List;

public class MainEmployee {


	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Manager());
		employeeList.add(new Developer());
		employeeList.add(new Intern());

		employeeList.forEach(System.out::println);

		double totalSum = Employee.calculateAllEmployeeSalary(employeeList);
		System.out.println("Общая зарплата всех сотрудников: " + totalSum);
	}
}
