package org.example.dz_9.dz_9_dopTasks;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
	/*
	Ограничение снизу
Задача: Реализуйте метод, который принимает List<T super Integer> и добавляет в него несколько чисел.
	 */

	public static <T> void addNumbers(List<T> list) {
		list.add((T) Integer.valueOf(5));
		list.add((T) Integer.valueOf(7));
		list.add((T) Integer.valueOf(1));
		list.add((T) Double.valueOf(1));
		list.add((T) Float.valueOf(9));
	}

	public static void main(String[] args) {
		List<Number> task5 = new ArrayList<>();
		addNumbers(task5);
		System.out.println(task5);
	}
}
