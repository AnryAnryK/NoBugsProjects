package org.example.answerBook.collectionsInJava.task4;

public class MainPerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.addPerson("Ваня", 22);
		person.addPerson("Люда", 23);
		person.addPerson("Зоя", 18);
		person.addPerson("Люда", 18);

		person.printPersons();

		person.findPersonByName("Зоя");
		person.findPersonByAge(18);
		person.findPersonByAge(42);
	}
}
