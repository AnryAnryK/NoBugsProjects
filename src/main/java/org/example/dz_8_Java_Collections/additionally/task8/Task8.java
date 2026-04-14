package org.example.dz_8_Java_Collections.additionally.task8;

import java.util.HashSet;

public class Task8 {

	int totalCountOfWords = 0;
	HashSet<String> hashSet1 = new HashSet<>();


	public int countOfWords(String word) {
		hashSet1.add(word);
		return this.totalCountOfWords++;
	}

	public static void main(String[] args) {

		Task8 task8 = new Task8();
		task8.countOfWords("Раз");
		task8.countOfWords("Раз");
		task8.countOfWords("Два");
		task8.countOfWords("Три");

		System.out.println("Всего слов : " + task8.totalCountOfWords);
		System.out.println("Всего уникальных слов : " + task8.hashSet1.size());
	}
}
