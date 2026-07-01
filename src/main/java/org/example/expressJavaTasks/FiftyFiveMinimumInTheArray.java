package org.example.expressJavaTasks;

/*
Найти минимальное число в массиве.
 */

public class FiftyFiveMinimumInTheArray {

// Вариант 1 - мой
//	public static OptionalInt minimumInTheArray(int[] arr) {
//		return Arrays.stream(arr).min();
//	}


	// Вариант 2 - учебный
	public static int minimumInTheArray(int[] arr) {
		if (arr == null || arr.length == 0 ){
			throw new IllegalArgumentException("Пустой массив !");
		}

		int min = arr[0];
		for (int n : arr)
			if (n < min) min = n;
		return min;
	}


	public static void main(String[] args) {
// Вариант 1 - мой
//		int[] newArray = {5, 7, 2, 3, 1, 8, 9, 0, -10};
//		OptionalInt minValue = minimumInTheArray(newArray);
//		System.out.println(minValue.getAsInt());


// Вариант 2 - учебный
		System.out.println(FiftyFiveMinimumInTheArray.minimumInTheArray(new int[]{5, 7, 2, 3, 1, 8, 9, 0, -10}));
		System.out.println(FiftyFiveMinimumInTheArray.minimumInTheArray(new int[]{}));
		System.out.println(FiftyFiveMinimumInTheArray.minimumInTheArray(null));
	}
}
