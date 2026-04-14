package org.example.dz_5_TaskDesignAlgorithm.task1Zoo;

public class Cat extends Animals {

	public static void main(String[] args) {
		Animals cat = new Cat();
		cat.makeNoice();
		cat.move();
	}

	@Override
	public void makeNoice() {
		System.out.println(": мяукает");
	}

	@Override
	public void move() {
		System.out.println(": крадётся");
	}
}
