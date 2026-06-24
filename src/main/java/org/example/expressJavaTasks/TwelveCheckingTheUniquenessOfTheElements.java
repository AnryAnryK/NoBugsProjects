package org.example.expressJavaTasks;

/*
Проверить, все ли элементы в массиве уникальны.
 */

import java.util.HashSet;
import java.util.Set;

public class TwelveCheckingTheUniquenessOfTheElements {

	public static Boolean checkingTheUniquenessOfTheElements(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int num: arr){
			if(!set.add(num)) return false;
		} return true;
	}

	public static void main(String[] args) {
		System.out.println(TwelveCheckingTheUniquenessOfTheElements.checkingTheUniquenessOfTheElements(new int[]{1, 2, 2, 4, 5}));
		System.out.println(TwelveCheckingTheUniquenessOfTheElements.checkingTheUniquenessOfTheElements(new int[]{1, 2, 3, 4, 5}));
		System.out.println(TwelveCheckingTheUniquenessOfTheElements.checkingTheUniquenessOfTheElements(new int[]{1, 1, 1, 1, 1}));
	}
}
