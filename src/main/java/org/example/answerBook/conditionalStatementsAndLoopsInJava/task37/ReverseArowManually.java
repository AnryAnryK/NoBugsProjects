package org.example.answerBook.conditionalStatementsAndLoopsInJava.task37;

/*
37. Переворот строки вручную
 Вводится строка. Выведи её в обратном порядке, не используя StringBuilder.reverse().
 */

public class ReverseArowManually {
	public String reverse(String str) {
		String reversedString  = "";

		for (int k = str.length() - 1; k >= 0; k--) {
			char right = str.charAt(k);
			reversedString  = reversedString  + right;
		}
		return reversedString ;
	}
}
