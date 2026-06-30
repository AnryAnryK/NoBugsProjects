package org.example.expressJavaTasks;

/*
Найти сумму всех чисел, встречающихся в строке.
 */

public class FortyOneTheSumOfTheNumbersInaRow {

	public static int theSumOfTheNumbersInaRow(String str) {
		int sum = 0;
		int num = 0;
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				num = num * 10 + (c - '0');
			} else {
				sum += num;
				num = 0;
			}
		}
		return sum + num;
	}

	public static void main(String[] args) {
		System.out.println(FortyOneTheSumOfTheNumbersInaRow.theSumOfTheNumbersInaRow("1, 2, три, 5, яблоко, погода"));
		System.out.println(FortyOneTheSumOfTheNumbersInaRow.theSumOfTheNumbersInaRow("1, 2, 0"));
		System.out.println(FortyOneTheSumOfTheNumbersInaRow.theSumOfTheNumbersInaRow("круассан, дерево, четыре"));
		System.out.println(FortyOneTheSumOfTheNumbersInaRow.theSumOfTheNumbersInaRow("1круассан, де2рево, четыре3"));

	}
}
