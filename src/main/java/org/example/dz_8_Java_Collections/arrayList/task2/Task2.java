package org.example.dz_8_Java_Collections.arrayList.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		for (Integer list : list1) {
			if (list % 2 == 0) {
				System.out.println(list);
			}
		}
	}
}
