package org.example.answerBook.oopPrinciplesInJava.task6;

/*
6. Сотрудники с разными ролями (Наследование + Переопределение логики)
 Создай базовый класс Employee с методом calculateSalary().
Реализуй наследников Manager, Developer, Intern, у которых зарплата рассчитывается по-разному.
Создай метод, принимающий список сотрудников и считающий общую зарплату.
Пояснение: показывает силу переопределения и полиморфного поведения.
 */

import java.util.List;

public abstract class Employee {
	static final double SALARY = 1000.00;

	public abstract double calculateSalary();

	public static double calculateAllEmployeeSalary(List<Employee> list) {
		double totalSum = 0;
		for (Employee e : list) {
			totalSum += e.calculateSalary();
		}
		return totalSum;


//		return list.stream().mapToDouble(Employee::calculateSalary).sum(); // это самый лучший вариант со stream, но я захотел сделать через ForEach-цикл, чтобы лучше разобраться
	}

	@Override
	public String toString() {
		return "Зарплата " + getClass().getSimpleName() + " равна " + calculateSalary();
	}
}
