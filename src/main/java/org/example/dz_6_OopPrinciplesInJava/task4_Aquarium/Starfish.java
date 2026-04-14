package org.example.dz_6_OopPrinciplesInJava.task4_Aquarium;

public class Starfish extends Animals implements Speedable, Conditionable {


	@Override
	public void condition() {
		System.out.println("Морская звезда - ползает");
	}

	@Override
	public void speed() {
		System.out.println("Морская звезда - передвигается медленно");
	}

	@Override
	public void showBehaviour() {
		condition();
		speed();
	}
}
