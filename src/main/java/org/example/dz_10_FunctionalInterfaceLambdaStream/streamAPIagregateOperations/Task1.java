package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIagregateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1 {
	/*
	1. Поиск максимального элемента
Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.
	 */

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 100, 22, 59);
		int maxValueFromList1 = list1.stream()
				.max(Comparator.naturalOrder())
				.orElseThrow(() -> new RuntimeException("Значение отсутствует"));
		System.out.println("в этой коллекции: " + list1 + " самое большое значение = " + maxValueFromList1);
		System.out.println("===========================================================================================");

		List<Integer> emptyList2 = Arrays.asList();
		int maxValueFromEmptyList2 = emptyList2.stream()
				.max(Comparator.naturalOrder())
				.orElseThrow(() -> new RuntimeException("в этой коллекции: " + emptyList2 + " нет ни одного значения"));
		System.out.println(maxValueFromEmptyList2);
	}
}
