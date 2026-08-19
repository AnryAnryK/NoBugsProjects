package org.example.answerBook.oopPrinciplesInJava.task2;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Гав-гав");
	}
}
