package org.example.answerBook.problemSolving.task6;

/*
Задача 6: Получение элемента по индексу

Описание:
 Метод getElement(String[] array, int index) должен возвращать элемент по индексу. Возникает ошибка при вызове с индексом, равным длине массива.
 */

public class RetrievingAnElementByIndex {

	public static String getElement(String[] array, int index) {

		if (index < array.length) {
			return array[index];
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(getElement(new String[]{"Первый", "Второй"}, 1));
		System.out.println(getElement(new String[]{"Первый", "Второй"}, 0));
	}
}
