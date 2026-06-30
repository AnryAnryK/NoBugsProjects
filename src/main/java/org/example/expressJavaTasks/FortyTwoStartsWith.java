package org.example.expressJavaTasks;

/*
Реализация startsWith без стандартных методов.
 */

public class FortyTwoStartsWith {

	public static boolean startsWith(String str, String prefix) {
		if (prefix.length() > str.length()) return false;
		for (int i = 0; i < prefix.length(); i++) {
			if (str.charAt(i) != prefix.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(FortyTwoStartsWith.startsWith("Улица роз", "Улица"));
		System.out.println(FortyTwoStartsWith.startsWith("Улица роз", "роз"));
		System.out.println(FortyTwoStartsWith.startsWith("Улица роз", "роз Улица"));
	}
}
