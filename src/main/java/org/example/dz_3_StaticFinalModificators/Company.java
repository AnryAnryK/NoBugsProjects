package org.example.dz_3_StaticFinalModificators;

public class Company {

	/*
	Класс Company
Создайте класс Company с полями:
static String companyName — общее название для всех сотрудников
final int employeeID — уникальный идентификатор (нельзя менять)

String employeeName — имя сотрудника Реализуйте конструктор, принимающий employeeID и employeeName, статический метод printCompanyName(),
геттеры и сеттеры для employeeName.

В main: создайте несколько сотрудников, измените companyName и проверьте, что она изменилась для всех. Попробуйте изменить employeeID — должно быть невозможно.
	 */

	public static void main(String[] args) {
		Company.printCompanyName();
		Company employee1 = new Company(1, "Вася");
		Company employee2 = new Company(2, "Петя");
		Company employee3 = new Company(3, "Витя");

		employee1.setEmployeeName("Люда");

		System.out.println("================================================");

		Company.companyName = "Lada";
		Company.printCompanyName();

	}

	static String companyName = "BMW";
	final int employeeID;
	String employeeName;


	Company(int newEmployeeID, String newEmployeeName) {
		this.employeeID = newEmployeeID;
		this.employeeName = newEmployeeName;
	}

	static void printCompanyName() {
		System.out.println(companyName);
	}

	void setEmployeeName(String newEmployeeName) {
		this.employeeName = newEmployeeName;
	}

	String getEmployeeName() {
		return this.employeeName;
	}

}
