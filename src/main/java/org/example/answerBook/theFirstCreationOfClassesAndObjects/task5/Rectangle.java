package org.example.answerBook.theFirstCreationOfClassesAndObjects.task5;

/*
5. Класс Rectangle
 Опиши класс Rectangle с полями width и height (оба int).
Добавь методы getArea() (площадь = ширина * высота) и isSquare() — возвращает true, если ширина равна высоте.
Создай объект и проверь оба метода.
 */


public class Rectangle {

	private int width;
	private int height;

	Rectangle(int width, int height) {
		if (width <= 0 || height <=0){
			throw new IllegalArgumentException("Значения ширины или высоты не могут быть меньше или равны 0");
		}
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getArea() {
		int area = width * height;
		return area;
	}

	public boolean isSquare() {
		if (width != height) {
			return false;
		}
		return true;
	}
}
