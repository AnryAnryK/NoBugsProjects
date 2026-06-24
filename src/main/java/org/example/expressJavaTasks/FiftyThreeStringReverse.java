package org.example.expressJavaTasks;

/*
Вернуть строку в обратном порядке.
 */

public class FiftyThreeStringReverse {

	public static String stringReverse (String str){
		return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(FiftyThreeStringReverse.stringReverse("Какой хороший день !"));
	}
}
