package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIagregateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Task2 {
	/*
	2. Поиск минимального элемента
Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число, используя Stream API.
	 */

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 100, 22, 59);
		int minValueFromList1 = list1.stream()
				.min(Comparator.naturalOrder())
				.orElseThrow(() -> new RuntimeException("Значение отсутствует"));
		System.out.println("в этой коллекции: " + list1 + " наименьшее значение = " + minValueFromList1);
		System.out.println("===========================================================================================");

		List<Integer> emptyList2 = Arrays.asList();
		int minValueFromEmptyList2 = emptyList2.stream()
				.min(Comparator.naturalOrder())
				.orElseThrow(() -> new NoSuchElementException("No value present"));
		System.out.println("Должно появиться исключение 'No value present', т.к. Список - пуст " + minValueFromEmptyList2);
	}
}
