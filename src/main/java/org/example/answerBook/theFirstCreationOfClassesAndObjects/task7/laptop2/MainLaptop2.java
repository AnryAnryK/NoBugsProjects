package org.example.answerBook.theFirstCreationOfClassesAndObjects.task7.laptop2;

import org.example.answerBook.theFirstCreationOfClassesAndObjects.task7.Laptop;

public class MainLaptop2 {
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop("Русь", 12);
		System.out.println(laptop1.specs());

		Laptop laptop2 = new Laptop("Русь-М", -2);
		System.out.println(laptop2.specs());
	}
}
