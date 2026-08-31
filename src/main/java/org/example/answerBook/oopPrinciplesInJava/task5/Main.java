package org.example.answerBook.oopPrinciplesInJava.task5;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		circle.printArea(circle);

		Rectangle rectangle = new Rectangle(2,4);
		rectangle.printArea(rectangle);

		Triangle triangle = new Triangle(3,5);
		triangle.printArea(triangle);
	}
}
