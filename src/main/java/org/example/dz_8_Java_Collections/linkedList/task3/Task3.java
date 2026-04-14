package org.example.dz_8_Java_Collections.linkedList.task3;

import java.util.LinkedList;

public class Task3 {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();
		list1.add("Задача 1");
		list1.add("Задача 2");
		list1.add("Задача 3");

		System.out.println("Первый элемент списка: " + list1.getFirst());
		System.out.println("Последний элемент списка: " + list1.getLast());
	}
}
