package org.example.answerBook.theFirstCreationOfClassesAndObjects.task5;

public class MainRectangle {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(2,3);
		System.out.print(rectangle1.getArea() + ": ");
		System.out.println(rectangle1.isSquare());

		Rectangle rectangle2 = new Rectangle(2,2);
		System.out.print(rectangle2.getArea() + ": ");
		System.out.println(rectangle2.isSquare());

		Rectangle rectangle3 = new Rectangle(0,2);
		System.out.print(rectangle3.getArea() + ": ");
		System.out.println(rectangle3.isSquare());

		Rectangle rectangle4 = new Rectangle(1,- 2);
		System.out.print(rectangle4.getArea() + ": ");
		System.out.println(rectangle4.isSquare());
	}
}
