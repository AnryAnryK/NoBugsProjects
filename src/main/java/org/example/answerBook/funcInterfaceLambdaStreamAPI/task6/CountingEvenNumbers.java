package org.example.answerBook.funcInterfaceLambdaStreamAPI.task6;

/*
6. Подсчёт чётных чисел
 Сосчитай количество чётных чисел в списке.
 */

import java.util.List;

public class CountingEvenNumbers {
	public static void main(String[] args) {
		System.out.println("Количество чётных чисел в списке: "+ count(List.of(1, 2, 3, 4, 5, 6)));
	}

	public static long count(List<Integer> numbers) {
		return numbers.stream().filter(x -> x % 2 == 0).count();
	}
}
