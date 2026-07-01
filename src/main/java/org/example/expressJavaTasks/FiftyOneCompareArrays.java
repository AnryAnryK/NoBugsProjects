package org.example.expressJavaTasks;

/*
Сравнить два массива по содержимому и порядку.
 */

import java.util.Arrays;

public class FiftyOneCompareArrays {

	public static boolean compareArrays(int[] arr1, int[] arr2) {
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		System.out.println(FiftyOneCompareArrays.compareArrays(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}));
		System.out.println(FiftyOneCompareArrays.compareArrays(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5, 6}));
	}
}
