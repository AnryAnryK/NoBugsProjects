package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIbaseOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
	/*
	5. Удаление дубликатов из списка
Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.
	 */

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,1,2,3,4,4,2);
		List<Integer> list1WithoutDuplicate = list1.stream().distinct().collect(Collectors.toList());
		System.out.println(list1WithoutDuplicate);
	}
}
