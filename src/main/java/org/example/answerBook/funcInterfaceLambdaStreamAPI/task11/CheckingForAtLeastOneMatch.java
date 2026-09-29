package org.example.answerBook.funcInterfaceLambdaStreamAPI.task11;

/*
11. Проверка хотя бы одного совпадения
 Есть ли хотя бы одно слово длиной больше 10 символов?
 */

import java.util.ArrayList;
import java.util.List;

public class CheckingForAtLeastOneMatch {
	private static final List<String> listOfWords = new ArrayList<>();

	public static void addWord(String word){
		listOfWords.add(word);
	}
	public static boolean checkMatch(List<String> listOfWords){
		return listOfWords.stream().anyMatch(x-> x.length() > 10);
	}
}
