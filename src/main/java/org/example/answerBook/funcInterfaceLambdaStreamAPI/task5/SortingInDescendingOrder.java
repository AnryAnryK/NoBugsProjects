package org.example.answerBook.funcInterfaceLambdaStreamAPI.task5;

/*
5. Сортировка по убыванию
 Отсортируй список строк по убыванию длины, используя Comparator и sorted().
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingInDescendingOrder {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Один");
		list.add("Два");
		list.add("Три");
		System.out.println(sorted(list));
	}

	public static List<String> sorted(List<String> list) {
		return list.stream().sorted(Comparator
						.comparingInt((String x) -> x.length())
						.reversed())
				.collect(Collectors.toList());
	}
}
