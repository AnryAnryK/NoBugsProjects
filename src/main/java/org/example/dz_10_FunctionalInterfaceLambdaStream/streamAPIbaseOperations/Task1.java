package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIbaseOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
	/*
	1. Фильтрация строк по длине больше 5
Задача: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее, используя Stream API.
	 */

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
		List<String> list1AfterFilter = list1.stream().filter(x -> x.length() > 5)
				.collect(Collectors.toList());
		System.out.println(list1AfterFilter);
	}
}
