package org.example.answerBook.staticFinalAccessModifiers.task3;

public class MainCountry {
	public static void main(String[] args) {
		Country russia = new Country("RU");
		System.out.println(russia.getCode());

		Country usa = new Country("USA");
		System.out.println(usa.getCode());
	}
}
