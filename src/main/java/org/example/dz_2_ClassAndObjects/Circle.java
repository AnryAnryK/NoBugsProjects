package org.example.dz_2_ClassAndObjects;

public class Circle {

	/*

	Класс Circle
Создайте класс Circle с полем radius. Реализуйте конструктор, геттер и сеттер,

методы calculateArea() и calculateCircumference().

В main измените радиус, выведите площадь и длину окружности.
	 */

	public static void main(String[] args) {
		Circle circle1 = new Circle(5);
		System.out.println("Размер площади : " + circle1.calculateArea());
		System.out.println("Размер окружности : " + circle1.calculateCircumference());
		circle1.setRadius(6);
		System.out.println("========================================");
		System.out.println("Размер площади после изменения радиуса : " + circle1.calculateArea());
		System.out.println("Размер окружности после изменения радиуса : " + circle1.calculateCircumference());
	}


	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

}
