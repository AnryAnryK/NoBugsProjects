package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIgroupingAndReduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
	/*
	2. Группировка чисел по чётности
Задача: Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные, используя Stream API.
	 */

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		Map<Boolean, List<Integer>> anEvenNumber = list1.stream().collect(Collectors.groupingBy(x -> x % 2 == 0));
		System.out.println("Чётные и нечётные значения из списка " + list1 + " : " + anEvenNumber);
	}
}
