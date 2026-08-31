package org.example.answerBook.oopPrinciplesInJava.task5;

public class Triangle extends Shape {
	private double footing;
	private double height;

	public Triangle(double footing, double height) {
		this.footing = footing;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (footing * height) / 2;
	}
}
