package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIagregateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
	/*
	5. Проверка наличия хотя бы одного элемента по условию
Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
	 */

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		boolean checkList1 = list1.stream().anyMatch(x -> x % 2 == 0);
		System.out.println("В списке " + list1 + " есть чётные числа (true / false): " + checkList1);
	}
}
