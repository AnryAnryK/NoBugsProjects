package org.example.answerBook.oopPrinciplesInJava.task2;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Мяу-мяу");
	}
}
