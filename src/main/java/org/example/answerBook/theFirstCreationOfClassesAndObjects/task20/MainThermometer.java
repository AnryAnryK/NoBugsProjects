package org.example.answerBook.theFirstCreationOfClassesAndObjects.task20;

public class MainThermometer {
	public static void main(String[] args) {
		Thermometer thermometer1 = new Thermometer(24);
		System.out.println(thermometer1.isFever());
		thermometer1.display();

		Thermometer thermometer2 = new Thermometer(45);
		System.out.println(thermometer2.isFever());
		thermometer2.display();
	}
}
