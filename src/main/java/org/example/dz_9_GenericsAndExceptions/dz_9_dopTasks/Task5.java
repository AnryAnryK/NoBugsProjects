package org.example.dz_9_GenericsAndExceptions.dz_9_dopTasks;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
	/*
	Ограничение снизу
Задача: Реализуйте метод, который принимает List<T super Integer> и добавляет в него несколько чисел.
	 */

	public static void addNumbers(List<Integer> list) {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
	}

	public static void main(String[] args) {
		List<Integer> task5 = new ArrayList<>();
		addNumbers(task5);
	}
}
