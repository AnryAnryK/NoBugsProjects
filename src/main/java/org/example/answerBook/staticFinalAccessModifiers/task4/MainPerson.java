package org.example.answerBook.staticFinalAccessModifiers.task4;

public class MainPerson {
	public static void main(String[] args) {
		Person vasia = new Person();
		vasia.setAge(25);
		vasia.addAge(1);
		System.out.println("Возраст: " + vasia.getAge());

		Person petia = new Person();
		petia.setAge(40);
		System.out.println("Возраст: " + petia.getAge());
	}
}
