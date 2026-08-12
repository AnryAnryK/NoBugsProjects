package org.example.answerBook.problemSolving.task5;

/*
Задача 5: Сравнение строк

Описание:
 Метод isSame(String a, String b) должен проверять равенство двух строк. Но результат зависит от ссылок, а не содержимого.
 */

public class StringComparison {

	public static boolean isSame(String a, String b) {
		if (a != b) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isSame("abc", "abc"));
		System.out.println(isSame("abbb", "accc"));
	}
}
