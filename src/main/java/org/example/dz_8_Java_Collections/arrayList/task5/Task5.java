package org.example.dz_8_Java_Collections.arrayList.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	List<Integer> list1;
	Integer countMax = 0;

	Task5() {
		this.list1 = new ArrayList<>();
	}

	public static void main(String[] args) {
		Task5 task5 = new Task5();
		task5.list1.add(1);
		task5.list1.add(2);
		task5.list1.add(3);
		task5.list1.add(4);

		for (Integer list : task5.list1) {
			if (list > task5.countMax) {
				task5.countMax = list;
			}
		}
		System.out.println("Максимальное число из списка: " + task5.countMax);
	}
}
