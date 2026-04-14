package org.example.dz_8_Java_Collections.arrayList.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

	List<Integer> list1;

	Task4() {
		this.list1 = new ArrayList<>();
	}

	public static void main(String[] args) {
		int sum = 0;

		Task4 task4 = new Task4();
		task4.list1.add(1);
		task4.list1.add(2);
		task4.list1.add(3);

		for (Integer int1 : task4.list1) {
			sum = sum + int1;
		}
		System.out.println("Сумма всех цифр в списке: " + sum);
	}
}
