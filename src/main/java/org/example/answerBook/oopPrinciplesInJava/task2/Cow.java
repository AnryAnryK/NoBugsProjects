package org.example.answerBook.oopPrinciplesInJava.task2;

public class Cow extends Animal {

	public Cow(String name){
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Му-му");
	}
}
