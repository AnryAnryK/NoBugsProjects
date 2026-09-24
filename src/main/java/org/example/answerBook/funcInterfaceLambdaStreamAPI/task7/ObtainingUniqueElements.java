package org.example.answerBook.funcInterfaceLambdaStreamAPI.task7;

/*
7. Получение уникальных элементов
 Из списка чисел убери повторы и отсортируй результат по возрастанию.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ObtainingUniqueElements {
	private static final List<Integer> listNumbers = new ArrayList<>();

	public static void addNumber(int number) {
		listNumbers.add(number);
	}

	public static List<Integer> distinctSorted() {
		return listNumbers.stream().distinct().sorted().collect(Collectors.toList());
	}
}
