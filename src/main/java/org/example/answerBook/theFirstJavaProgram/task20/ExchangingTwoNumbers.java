package org.example.answerBook.theFirstJavaProgram.task20;

/*
20. В методе swap(int a, int b) выведи сначала a, потом b, а затем поменяй их местами и снова выведи.
Подсказка: используй временную переменную int temp = a.
 */

public class ExchangingTwoNumbers {

	public static void swap(int a, int b) {
		System.out.println("Вывод значений до изменений");
		System.out.println(a);
		System.out.println(b);

		int change = a;
		a = b;
		b = change;

		System.out.println("Вывод значений после изменений");
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		swap(2,5);
	}
}
