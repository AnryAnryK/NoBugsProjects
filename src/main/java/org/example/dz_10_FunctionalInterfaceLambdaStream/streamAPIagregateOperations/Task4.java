package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIagregateOperations;

import java.util.Arrays;
import java.util.List;

public class Task4 {
	/*
	4. Поиск первого элемента, начинающегося на "Б"
Задача: Напишите программу, которая принимает список строк и находит первую строку, начинающуюся на букву "Б", используя Stream API.
	 */

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Женя", "Вася", "Бобо", "Мамба", "Бамба");
		String list1BeginToB = list1.stream()
				.filter(x -> x.startsWith("Б"))
				.findFirst()
				.toString();
		System.out.println(list1BeginToB);
	}
}
