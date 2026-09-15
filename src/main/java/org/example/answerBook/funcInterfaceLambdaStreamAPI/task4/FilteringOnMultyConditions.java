package org.example.answerBook.funcInterfaceLambdaStreamAPI.task4;

/*
Фильтрация по нескольким условиям
 Оставь только положительные чётные числа. Используй цепочку filter() с несколькими Predicate.
 */

import java.util.List;
import java.util.stream.Collectors;

public class FilteringOnMultyConditions {
	public static void main(String[] args) {
		List<Integer> ints = List.of(1, 0, -2, -3, 4, 5, -6, 7, 8);
		System.out.println(FilterByMultipleConditions(ints));
	}

	public static List<Integer> FilterByMultipleConditions(List<Integer> ints) {
		return ints.stream()
				.filter(x -> x % 2 == 0)
				.filter(x -> x > 0)
				.collect(Collectors.toList());
	}
}
