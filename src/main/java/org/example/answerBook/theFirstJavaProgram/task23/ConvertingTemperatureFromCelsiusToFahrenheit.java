package org.example.answerBook.theFirstJavaProgram.task23;

/*
23. Перевод температуры из Цельсия в Фаренгейты
Метод celsiusToFahrenheit(double c) возвращает c * 9/5 + 32.
 */

public class ConvertingTemperatureFromCelsiusToFahrenheit {

	public static double celsiusToFahrenheit(int celsius) {
		return (double) celsius * 9/5 + 32;
	}

	public static void main(String[] args) {
		System.out.println(celsiusToFahrenheit(20));
	}
}
