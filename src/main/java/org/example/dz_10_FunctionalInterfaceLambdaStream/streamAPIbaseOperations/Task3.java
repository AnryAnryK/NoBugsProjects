package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIbaseOperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3 {
	/*
	3. Преобразование строк в их длины
Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.
	 */

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
		List<Integer> list1ToInt = list1.stream().map(x -> x.length()).collect(Collectors.toList());
		System.out.println(list1ToInt);
	}
}
