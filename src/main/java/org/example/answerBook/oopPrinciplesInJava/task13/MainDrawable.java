package org.example.answerBook.oopPrinciplesInJava.task13;

public class MainDrawable {
	public static void main(String[] args) {
		Canvas canvas1 = new Canvas();
		canvas1.addToDrawableList(new Line());
		canvas1.addToDrawableList(new Rectangle());
		canvas1.addToDrawableList(new Text());
		canvas1.showAllFigures();
	}
}
