package org.example.answerBook.theFirstCreationOfClassesAndObjects.task25;

public class MainLightBulb {
	public static void main(String[] args) {
		LightBulb lightBulb1 = new LightBulb();
		lightBulb1.switchState();
		lightBulb1.printState();

		lightBulb1.switchState();
		lightBulb1.printState();

		lightBulb1.switchState();
		lightBulb1.printState();

		System.out.println(lightBulb1.getIsOn());
		lightBulb1.switchState();
		System.out.println(lightBulb1.getIsOn());
	}
}
