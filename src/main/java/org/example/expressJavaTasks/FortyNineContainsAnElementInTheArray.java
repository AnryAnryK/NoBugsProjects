package org.example.expressJavaTasks;

/*
Проверить, есть ли элемент в массиве.
 */

public class FortyNineContainsAnElementInTheArray {

	public static boolean containsAnElementInTheArray(int[] arr, int target) {

		for (int num : arr) {
			if (num == target) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(FortyNineContainsAnElementInTheArray.containsAnElementInTheArray(new int[]{1, 2, 3, 4, 5}, 1));
		System.out.println(FortyNineContainsAnElementInTheArray.containsAnElementInTheArray(new int[]{1, 2, 3, 4, 5}, 6));
	}
}
