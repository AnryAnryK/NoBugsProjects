package org.example.answerBook.theFirstJavaProgram.task24;

/*
24. Перевод расстояния из километров в мили
Метод kmToMiles(double km) возвращает km * 0.621371.
 */

public class ConvertingDistanceFromKilometersToMiles {

	public static double kmToMiles(int kilometers) {
		return (double) kilometers * 0.621371;
	}

	public static void main(String[] args) {
		System.out.println(kmToMiles(20));
	}
}
