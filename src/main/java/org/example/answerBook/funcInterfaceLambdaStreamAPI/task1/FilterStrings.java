package org.example.answerBook.funcInterfaceLambdaStreamAPI.task1;

/*
Фильтрация строк по длине
 Из списка строк выбери только те, чья длина больше 5, используя Predicate и stream().filter().
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Да", "Нет", "Хорошо", "Замечательно");
		System.out.println(findStringsLongerThan5(list));
	}

	public static List<String> findStringsLongerThan5(List<String> lst) {
		return lst.stream().filter(x -> x.length() > 5).collect(Collectors.toList());
	}
}
