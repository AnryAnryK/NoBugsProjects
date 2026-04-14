package org.example.dz_8_Java_Collections.additionally.task4;

import java.util.HashSet;

public class Task4 {
	int totalCount = 0;
	HashSet<String> hashSet1 = new HashSet<>();


	public int countOfVisits(String url) {
		hashSet1.add(url);
		return this.totalCount++;
	}

	public void showUniqueUrlVisits() {
		System.out.println("Общее кол-во посещений : " + totalCount + "; Уникальное кол-во посещений : " + hashSet1.size());
	}

	public static void main(String[] args) {

		Task4 task4_ = new Task4();
		task4_.countOfVisits("URL_1");
		task4_.countOfVisits("URL_1");
		task4_.countOfVisits("URL_2");
		task4_.countOfVisits("URL_2");

		task4_.showUniqueUrlVisits();
	}
}
