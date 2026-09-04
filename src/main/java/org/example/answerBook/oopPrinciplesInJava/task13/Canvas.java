package org.example.answerBook.oopPrinciplesInJava.task13;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	private List<Drawable> drawableList = new ArrayList<>();

	public void addToDrawableList(Drawable figure) {
		drawableList.add(figure);
	}

	public void showAllFigures() {
		for (Drawable figure : drawableList) {
			System.out.println("Фигура: " + figure.draw());
		}
	}
}
