package org.example.expressJavaTasks;

/*
Удалить все дубликаты из массива.
 */

import java.util.Arrays;

public class ThirtyEightRemoveDuplicates {

	public static int[] removeDuplicates(int[] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(ThirtyEightRemoveDuplicates.removeDuplicates(new int[]{1, 2, 2, 3, 4, 4, 5, 6})));
	}
}
