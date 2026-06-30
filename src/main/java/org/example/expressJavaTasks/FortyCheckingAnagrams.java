package org.example.expressJavaTasks;

/*
Проверить, являются ли строки анаграммами.
 */

import java.util.Arrays;

public class FortyCheckingAnagrams {

	public static boolean checkingAnagrams(String str1, String str2) {
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}

	public static void main(String[] args) {
		System.out.println(FortyCheckingAnagrams.checkingAnagrams("арфа", "фара"));
		System.out.println(FortyCheckingAnagrams.checkingAnagrams("луг", "гул"));
		System.out.println(FortyCheckingAnagrams.checkingAnagrams("лига", "игла"));
		System.out.println(FortyCheckingAnagrams.checkingAnagrams("спрос", "опрос"));

	}
}
