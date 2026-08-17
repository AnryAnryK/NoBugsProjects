package org.example.answerBook.theFirstCreationOfClassesAndObjects.task12;

public class MainTV {
	public static void main(String[] args) {
		TV tv1 = new TV("Ekko", false);
		tv1.togglePower();
		tv1.printState();

		tv1.togglePower();
		tv1.printState();
	}
}
