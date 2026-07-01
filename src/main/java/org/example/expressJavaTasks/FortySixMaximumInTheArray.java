package org.example.expressJavaTasks;

/*
Найти максимальный элемент.
 */

public class FortySixMaximumInTheArray {

	public static int maximumInTheArray(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (max < num) max = num;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(FortySixMaximumInTheArray.maximumInTheArray(new int[]{1, 2, 3, 4, 5}));
	}
}
