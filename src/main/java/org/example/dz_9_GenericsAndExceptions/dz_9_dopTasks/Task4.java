package org.example.dz_9_GenericsAndExceptions.dz_9_dopTasks;

import java.util.List;

public class Task4 {
	/*
	Ограничение сверху
Задача: Напишите обобщённый метод, который принимает List<T extends Number> и вычисляет сумму элементов.
	 */
	public static <T extends Number> void summ(List<T> list) {
		double total = 0;
		for (T list1 : list) {
			total = (total + list1.doubleValue());
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		List<Integer> li1 = List.of(1, 3, 5);
		List<Double> ld2 = List.of(1.1, 3.3, 5.5);

		summ(li1);
		summ(ld2);
	}
}

