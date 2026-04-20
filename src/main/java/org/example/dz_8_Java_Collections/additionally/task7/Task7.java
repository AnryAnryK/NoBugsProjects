package org.example.dz_8_Java_Collections.additionally.task7;

import java.util.ArrayDeque;

public class Task7 {

	public boolean isCorrect(String str) {
		ArrayDeque arrayDeque1 = new ArrayDeque<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				arrayDeque1.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (arrayDeque1.isEmpty()) {
					return false;
				}
				char top = (char) arrayDeque1.pop();
				if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
					return false;
				}
			}
		}
		return arrayDeque1.isEmpty();
	}

	public static void main(String[] args) {
		Task7 task7 = new Task7();

		System.out.println(task7.isCorrect("(утро)"));
		System.out.println(task7.isCorrect("{день}"));
		System.out.println(task7.isCorrect("[вечер]"));
	}
}
