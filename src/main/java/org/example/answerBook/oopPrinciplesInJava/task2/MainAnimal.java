package org.example.answerBook.oopPrinciplesInJava.task2;

public class MainAnimal {
	public static void main(String[] args) {
		Animal dog = new Dog("Шарик");
		dog.describe();

		Animal cat = new Cat("Мурзик");
		cat.describe();

		Animal cow = new Cow("Милка");
		cow.describe();
	}
}
