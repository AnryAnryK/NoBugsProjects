package org.example.answerBook.exceptionsAndGenerics.task7;

public class MainSafeDivision {
	public static void main(String[] args) {

		System.out.println("Результат деления: " + SafeDivision.divide(1, 0));
		System.out.println("Результат деления: " + SafeDivision.divide(15, 3));
		System.out.println("Результат деления: " + SafeDivision.divide(0, 5));
	}
}
