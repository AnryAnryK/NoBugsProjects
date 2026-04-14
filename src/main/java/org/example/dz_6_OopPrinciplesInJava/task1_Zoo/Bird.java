package org.example.dz_6_OopPrinciplesInJava.task1_Zoo;

public class Bird extends Animal {

	@Override
	public void makeNoice() {
		System.out.println("Птица - чирикает");

	}

	@Override
	public void move() {
		System.out.println("Птица - летает");

	}
}
