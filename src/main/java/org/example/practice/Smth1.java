package org.example.practice;

import java.util.Arrays;

public class Smth1 {

	public static boolean arraysEquals(int[] a, int[] b) {

		if (a == null || b == null) {
			throw new NullPointerException("Массив не может быть null");
		}
		if (a.length == 0 || b.length == 0) {
			throw new IllegalArgumentException("Массив не заполнен - заполните массив данными !");
		}

		return Arrays.equals(a, b);
	}

	public static void main(String[] args) {
		System.out.println(Smth1.arraysEquals(new int[]{1, 1, 3, 5}, new int[]{1, 1, 3, 5}));
		System.out.println(Smth1.arraysEquals(new int[]{1, 2, 3, 5}, new int[]{1, 1, 3, 5}));
		System.out.println(Smth1.arraysEquals(new int[]{}, new int[]{1, 1, 3, 5}));
		System.out.println(Smth1.arraysEquals(new int[]{}, new int[]{}));
		System.out.println(Smth1.arraysEquals(null, new int[]{}));
	}
}
