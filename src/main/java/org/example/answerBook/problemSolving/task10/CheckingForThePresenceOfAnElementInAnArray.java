package org.example.answerBook.problemSolving.task10;

/*
Задача 10: Проверка наличия элемента в массиве

Описание:
 Метод contains(String[] array, String value) проверяет наличие элемента. При null в массиве возникает ошибка.
 */

public class CheckingForThePresenceOfAnElementInAnArray {

	public static boolean contains(String[] array, String value) {
		if (array == null || array.length == 0) {
			return false;
		}

		for (String val : array) {
			if (val != null && val.equals(value)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(contains(new String[]{"Раз", "Два", "Три"}, "Два"));
		System.out.println(contains(new String[]{}, "Два"));
		System.out.println(contains(null, "Два"));
		System.out.println(contains(new String[]{"Раз", null, "Три"}, "Два"));
	}
}
