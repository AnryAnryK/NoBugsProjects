package org.example.dz_8_Java_Collections.arrayList.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println("Список ArrayList из 5 чисел :" + list1);
		System.out.println();
		list1.add(5,6);
		System.out.println("Список ArrayList из 5 чисел + ещё одно :" + list1);

	}
}
