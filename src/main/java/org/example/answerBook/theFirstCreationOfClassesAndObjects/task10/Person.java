package org.example.answerBook.theFirstCreationOfClassesAndObjects.task10;

/*
10. Класс Person
 Напиши класс Person с полями firstName и lastName.
Добавь метод getFullName(), который возвращает полное имя: firstName + " " + lastName.
 */

public class Person {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}
}
