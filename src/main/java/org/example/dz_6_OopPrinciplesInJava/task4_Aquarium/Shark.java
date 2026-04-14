package org.example.dz_6_OopPrinciplesInJava.task4_Aquarium;

public class Shark extends Animals implements Speedable, Conditionable {

	private Animals animal;

	@Override
	public void condition() {
		System.out.println("Акула - передвигается агрессивно");
	}


	@Override
	public void speed() {
		System.out.println("Акула - передвигается быстро");
	}


	@Override
	public void showBehaviour() {
		condition();
		speed();
	}
}
