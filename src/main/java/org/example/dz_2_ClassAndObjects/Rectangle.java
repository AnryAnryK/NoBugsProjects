package org.example.dz_2_ClassAndObjects;

public class Rectangle {

/*
Класс Rectangle
Создайте класс Rectangle с полями width и height.
Реализуйте конструктор, геттеры для ширины и высоты, сеттер только для ширины
и метод calculateArea() для расчёта площади.

В main создайте прямоугольник, измените ширину и выведите площадь.
 */

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("Площадь прямоугольника равна : " + rectangle.calculateArea());
		rectangle.setWidth(3);
		System.out.println("Площадь прямоугольника после изменения ширины равна : " + rectangle.calculateArea());

	}

	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int calculateArea() {
		return this.width * this.height;
	}
}
