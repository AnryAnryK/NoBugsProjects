package org.example.answerBook.funcInterfaceLambdaStreamAPI.task11;

import java.util.List;

import static org.example.answerBook.funcInterfaceLambdaStreamAPI.task11.CheckingForAtLeastOneMatch.checkMatch;

public class MainCheckingForAtLeastOneMatch {
	public static void main(String[] args) {

//		CheckingForAtLeastOneMatch.addWord("Рубеж");
//		CheckingForAtLeastOneMatch.addWord("Бутерброд");
//		CheckingForAtLeastOneMatch.addWord("Слонопотам1");

		System.out.println(checkMatch(List.of("Рубеж", "Бутерброд", "Слонопотам1")));
	}
}
