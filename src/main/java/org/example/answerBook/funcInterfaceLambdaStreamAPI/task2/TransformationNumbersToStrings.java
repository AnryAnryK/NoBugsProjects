package org.example.answerBook.funcInterfaceLambdaStreamAPI.task2;

/*
Преобразование чисел в строки
 Преобразуй список чисел в список строк с приставкой "Число: " — используй Function.
 */

import java.util.List;
import java.util.stream.Collectors;

public class TransformationNumbersToStrings {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		System.out.println(transform(numbers));
	}

	public static List<String> transform(List<Integer> numbers) {
		return numbers.stream().map(x -> "Число: " + x.toString()).collect(Collectors.toList());
	}
}
