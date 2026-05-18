package org.example.dz_10_FunctionalInterfaceLambdaStream.streamAPIagregateOperations;

import java.util.Arrays;
import java.util.List;

public class Task3 {
	/*
	3. Сумма всех элементов списка
Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.
	 */

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		int list1Summary = list1.stream().mapToInt(x -> x).sum();
		System.out.println("Сумма чисел в списке равна: " + list1Summary);
	}
}
