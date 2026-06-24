package org.example.expressJavaTasks;

/*
Проверить, являются ли две строки анаграммами друг друга.
 */

import java.util.Arrays;

public class NineCheckingTheAnagram {

	public static boolean checkingTheAnagram(String a, String b){
		char[] ca = a.toCharArray(), cb = b.toCharArray();
		Arrays.sort(ca);
		Arrays.sort(cb);
		return Arrays.equals(ca, cb);
	}

	public static void main(String[] args) {
		System.out.println(NineCheckingTheAnagram.checkingTheAnagram("казак", "казак"));
		System.out.println(NineCheckingTheAnagram.checkingTheAnagram("казак", "рыбак"));
	}
}
