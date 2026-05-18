package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIgroupingAndReduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
	/*
	3. Поиск среднего значения чисел
Задача: Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.
	 */

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		double middleValueFromList1 = list1.stream().collect(Collectors.averagingInt(x -> x));
		System.out.println(middleValueFromList1);
	}
}
