package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIbaseOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
	/*
	4. Создание списка квадратов чисел
Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список, где каждое число заменено на его квадрат, используя Stream API.
	 */

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list1New = list1.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(list1New);
	}
}
