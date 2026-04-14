package org.example.dz_2_ClassAndObjects;

public class Point {

	/*

	Класс Point
Создайте класс Point с координатами x и y.
Реализуйте конструктор, геттеры, сеттер только для x, и метод print(),
выводящий координаты.

В main измените x, выведите новые координаты.
	 */

	public static void main(String[] args) {

		Point point1 = new Point(2, 3);
		point1.print();
		point1.setX(4);
		System.out.println("Координаты после переопределения х");
		point1.print();

	}

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void print() {
		System.out.println("Координата х = " + getX());
		System.out.println("Координата y = " + getY());
	}

}
