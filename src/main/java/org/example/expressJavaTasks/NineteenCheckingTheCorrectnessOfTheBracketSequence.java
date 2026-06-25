package org.example.expressJavaTasks;

/*
Проверить, сбалансированы ли круглые скобки в строке.

Использовать стек для отслеживания открывающих и закрывающих скобок.
 */

public class NineteenCheckingTheCorrectnessOfTheBracketSequence {

	public static boolean checkingTheCorrectnessOfTheBracketSequence(String str) {

		int balance = 0;
		for (char c : str.toCharArray()) {
			if (c == '(') {
				balance++;
			} else if (c == ')') {
				balance--;
			}
		} return balance == 0;
	}

	public static void main(String[] args) {
		System.out.println(NineteenCheckingTheCorrectnessOfTheBracketSequence.checkingTheCorrectnessOfTheBracketSequence("Сушки (1 килограмм), сыр (300 грамм)"));
		System.out.println(NineteenCheckingTheCorrectnessOfTheBracketSequence.checkingTheCorrectnessOfTheBracketSequence("Сушки (1 килограмм), сыр (300 грамм))"));
	}
}
