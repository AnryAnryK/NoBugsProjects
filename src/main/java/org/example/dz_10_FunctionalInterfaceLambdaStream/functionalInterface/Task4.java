package org.example.dz_10_FunctionalInterfaceLambdaStream.functionalInterface;

import java.util.function.Function;

public class Task4 {
	/*
	4. Лямбда-выражение с Function
Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
	 */

	public static void main(String[] args) {
		Function<String, Integer> tst1 = x -> x.length();
		System.out.println(tst1.apply("Мне нравится тестировать"));
	}
}
