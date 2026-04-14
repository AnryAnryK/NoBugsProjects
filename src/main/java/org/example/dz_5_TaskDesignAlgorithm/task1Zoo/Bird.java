package org.example.dz_5_TaskDesignAlgorithm.task1Zoo;

public class Bird extends Animals {

	public static void main(String[] args) {
		Animals bird = new Bird();
		bird.makeNoice();
		bird.move();
	}

	@Override
	public void makeNoice() {
		System.out.println(": чирикает");
	}

	@Override
	public void move() {
		System.out.println(": летает");
	}
}
