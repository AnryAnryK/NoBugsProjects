package org.example.answerBook.theFirstCreationOfClassesAndObjects.task6;

public class MainCircle {

	public static void main(String[] args) {

		Circle circle1 = new Circle(5);
		System.out.println(circle1.getArea());

		Circle circle2 = new Circle(-3);
		System.out.println(circle2.getArea());
	}
}
