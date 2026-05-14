package org.example.dz_9_GenericsAndExceptions.dz_9_dopTasks;

import java.util.List;

public class Task2 {

	/*
Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и выводит его элементы.
	 */

	static List<Integer> list1 = List.of(1, 2, 3);
	static List<String> list2 = List.of("Один", "Два", "Три");

	public static void main(String[] args) {
		Task2 task2 = new Task2();
		task2.printList(list1);
		task2.printList(list2);
	}

	public static <T> void printList(List<T> list) {
		for (T lists : list) {
			System.out.println(lists);
		}
	}
}
