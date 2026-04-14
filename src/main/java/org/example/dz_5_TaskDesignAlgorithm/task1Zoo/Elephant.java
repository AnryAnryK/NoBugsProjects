package org.example.dz_5_TaskDesignAlgorithm.task1Zoo;

public class Elephant extends Animals {

	public static void main(String[] args) {
		Animals elephant = new Elephant();
		elephant.makeNoice();
		elephant.move();
	}

	@Override
	public void makeNoice() {
		System.out.println(": трубит");
	}

	@Override
	public void move() {
		System.out.println(": ходит");
	}
}
