package org.example.dz_10_FunctionalInterfaceLambdaStream.functionalInterface;

import java.util.function.Consumer;

public class Task5 {
	/*
	5. Использование Consumer
Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
	 */

	public static void main(String[] args) {
		Consumer<String> cnsmr1 = x-> System.out.println(x);
		cnsmr1.accept("Печатаю в консоль");
	}
}
