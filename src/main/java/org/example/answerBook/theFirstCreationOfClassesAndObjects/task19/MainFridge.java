package org.example.answerBook.theFirstCreationOfClassesAndObjects.task19;

public class MainFridge {
	public static void main(String[] args) {
		Fridge ariston = new Fridge();
		ariston.setTemperature(28);
		System.out.println(ariston.getStatus());
	}
}
