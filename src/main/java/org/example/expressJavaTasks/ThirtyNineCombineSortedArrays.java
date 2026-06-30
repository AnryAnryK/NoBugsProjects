package org.example.expressJavaTasks;

/*
Объединить два отсортированных массива в один отсортированный.
 */

import java.util.Arrays;

public class ThirtyNineCombineSortedArrays {

	public static int[] combineSortedArrays(int[] a, int[] b) {
// Вариант 1 - лучшее решение !:

		int[] result = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			result[k++] = a[i] < b[j] ? a[i++] : b[j++];
		}
		while (i < a.length) result[k++] = a[i++];
		while (j < b.length) result[k++] = b[j++];
		return result;

// Вариант 2:  рабочее решение через Stream ! Но лучшим считается Вариант 1 !!!
//		List<Integer> arr1 = List.of(1, 2, 3, 4, 5);
//		List<Integer> arr2 = List.of(6, 7, 8, 9, 10);
//		return Stream.concat(arr1.stream(), arr2.stream()).sorted().collect(Collectors.toList()); // в методе public static тип данных нужно только Список Интеджеров указать List<Integer>  combineSortedArrays() {}

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(ThirtyNineCombineSortedArrays.combineSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
	}
}
