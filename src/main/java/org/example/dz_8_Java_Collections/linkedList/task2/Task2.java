package org.example.dz_8_Java_Collections.linkedList.task2;

import java.util.LinkedList;

public class Task2 {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();
		list1.add("Задача 1");
		list1.add("Задача 2");
		list1.add("Задача 3");

		while (!list1.isEmpty()) {
			System.out.println(list1.poll());
		}
	}
}
