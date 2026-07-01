package org.example.expressJavaTasks;

/*
Вернуть факториал числа n.
 */


public class FortyFourFactorialRecursively {

	public static int factorialRecursively(int number) {
		if (number <= 1) return 1;
		return number * factorialRecursively(number - 1);
	}

	public static void main(String[] args) {
		System.out.println(FortyFourFactorialRecursively.factorialRecursively(5));
		System.out.println(FortyFourFactorialRecursively.factorialRecursively(1));
		System.out.println(FortyFourFactorialRecursively.factorialRecursively(0));
		System.out.println(FortyFourFactorialRecursively.factorialRecursively(-1));
	}
}
