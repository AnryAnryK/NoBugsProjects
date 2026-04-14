package org.example.dz_8_Java_Collections.linkedList.task4;

import java.util.LinkedList;

public class Task4 {

	public static void main(String[] args) {

		Integer sum = 0;

		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		for (Integer list : list1) {
			sum = list + sum;
		}
		System.out.println(sum);
	}
}

