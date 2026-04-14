package org.example.dz_8_Java_Collections.linkedList.task5;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task5 {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList1 = new LinkedList<>();
		linkedList1.add(1);
		linkedList1.add(2);
		linkedList1.add(3);
		linkedList1.add(4);

		ListIterator<Integer> listIterator1 = linkedList1.listIterator();

		while (listIterator1.hasNext()) {
			System.out.println("Вывод списка от начала до конца : " + listIterator1.next());
		}

		System.out.println();

		while (listIterator1.hasPrevious()) {
			System.out.println("Вывод списка с конца до начала : " + listIterator1.previous());
		}
	}
}
