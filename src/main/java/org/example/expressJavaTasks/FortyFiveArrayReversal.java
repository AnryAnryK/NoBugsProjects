package org.example.expressJavaTasks;

/*
Перевернуть массив в обратном порядке.
 */

import java.util.Arrays;

public class FortyFiveArrayReversal {

	public static void arrayReversal(int[] arr) {
		int leftArr = 0;
		int rightArr = arr.length - 1;
		while (leftArr < rightArr) {
			int temp = arr[leftArr];
			arr[leftArr++] = arr[rightArr];
			arr[rightArr--] = temp;
		}
	}

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4};
		arrayReversal(num);
		System.out.println(Arrays.toString(num));
	}
}
