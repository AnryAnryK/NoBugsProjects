package org.example.answerBook.collectionsInJava.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Synonyms synonyms = new Synonyms();
		synonyms.addWord("Банка", List.of("Склянка", "Жбанка", "Бутылка"));
		synonyms.addWord("Хлеб", List.of("Булка","Крендель", "Сдоба"));

		System.out.println(synonyms.getSynonymsByWord("Хлеб"));
		System.out.println(synonyms.getSynonymsByWord(""));
	}
}
