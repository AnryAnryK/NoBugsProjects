package org.example.dz_10_FunctionalInterfaceLambdaStream.functionalInterface;

import java.util.function.Predicate;

public class Task3 {
	/*
3. Лямбда-выражение с Predicate
Задача: Напишите лямбду, которая проверяет, является ли число чётным.
	 */

	public static void main(String[] args) {
		Predicate<Integer> abc = (x -> x%2 ==0);
		System.out.println("Число '2' чётное: " + abc.test(2));
		System.out.println("Число '3' нечётное: " + abc.test(3));
	}
}
