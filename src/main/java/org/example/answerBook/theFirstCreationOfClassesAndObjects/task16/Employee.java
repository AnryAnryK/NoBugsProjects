package org.example.answerBook.theFirstCreationOfClassesAndObjects.task16;

/*
16. Класс Employee
 Создай класс Employee с полями: name, position (String), salary (double).
Метод describe() печатает: <name> работает как <position> с зарплатой <salary>.
 */

public class Employee {
	private String name;
	private String position;
	private double salary;

	public Employee(String name, String position, double salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public void describe(){
		System.out.println("\"" + name + "\" работает как \"" + position + "\" с зарплатой \"" + salary + "\"");
	}
}
