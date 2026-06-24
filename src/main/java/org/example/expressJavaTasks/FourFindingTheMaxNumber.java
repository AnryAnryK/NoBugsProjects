package org.example.expressJavaTasks;

/*
Найти наибольшее число в массиве.
 */

public class FourFindingTheMaxNumber {

	public static int findingTheMaxNumber(int[] arr) {
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException();
		int max = arr[0];
		for (int array : arr) {
			if (array > max) max = array;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(FourFindingTheMaxNumber.findingTheMaxNumber(new int[]{1, 2, 3, 4, 5}));
		System.out.println(FourFindingTheMaxNumber.findingTheMaxNumber(new int[]{}));
		System.out.println(FourFindingTheMaxNumber.findingTheMaxNumber(new int[]{Integer.parseInt(null)}));
	}
}
