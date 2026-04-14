package org.example.dz_6_OopPrinciplesInJava.task1_Zoo;

public class Elephant extends Animal {

	@Override
	public void makeNoice() {
		System.out.println("Слон - трубит");
	}

	@Override
	public void move(){
		System.out.println("Слон - ходит");
	}
}
