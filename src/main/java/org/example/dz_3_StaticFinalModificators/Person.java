package org.example.dz_3_StaticFinalModificators;

public class Person {
	/*
		Класс Person
	Создайте класс Person с полями:
	private String firstName
	private String lastName
	private final String ssn — номер социального страхования
	Реализуйте конструктор для всех трёх полей, геттеры для всех полей, сеттеры только для firstName и lastName,
	метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".
	В main: создайте несколько объектов, измените имя у одного и выведите информацию.
		 */

	public static void main(String[] args) {
		Person person1 = new Person("Иван", "Иванов",  "123-45-6789");
		Person person2 = new Person("Петр", "Петров",  "6789");
		person1.printPersonInfo();
		person2.printPersonInfo();
		System.out.println("============================");
		person1.setFirstName("Роман");
		person1.printPersonInfo();
	}

	private String firstName;
	private String lastName;
	private final String ssn;

	public Person(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	void printPersonInfo() {
		System.out.println("Имя : " + firstName + "; Фамилия : " + lastName + "; SSN : " + ssn);
	}
}
