package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIbaseOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
	/*
	2. Фильтрация чисел, кратных 5
Задача: Напишите программу, которая принимает список чисел и отбирает только те, которые делятся на 5 без остатка, используя Stream API.
	 */

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 5, 7, 10, 12);
		List<Integer> list1divisionOn5 = list1.stream()
				.filter(x -> x % 5 == 0)
				.collect(Collectors.toList());
		System.out.println(list1divisionOn5);
	}
}
