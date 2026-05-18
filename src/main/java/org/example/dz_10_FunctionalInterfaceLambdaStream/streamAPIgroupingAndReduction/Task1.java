package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIgroupingAndReduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
	/*
	1. Группировка строк по первой букве
Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.
	 */

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Яблоки", "Виноград", "Киви", "Апельсины", "Бананы");
		Map<Character, List<String>> list1GrouppingByFirstCharacter = list1.stream()
				.collect(Collectors.groupingBy(x -> x.charAt(0)));
		System.out.println(list1GrouppingByFirstCharacter);
	}
}
