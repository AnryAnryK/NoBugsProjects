package org.example.answerBook.collectionsInJava.task25;

import java.util.Set;

public class MainCountingNumberOfUsersForEachDate {
	public static void main(String[] args) {
		CountingNumberOfUsersForEachDate countingNumberOfUsersForEachDate = new CountingNumberOfUsersForEachDate();

		User userIvanIvanov = new User("Иван", "Иванов");
		User userPetrPetrov = new User("Петр", "Петров");
		User userSidorSidorov = new User("Сидор", "Сидоров");

		Date date01 = new Date("2026.01.01");
		Date date02 = new Date("2026.01.02");
		Date date03 = new Date("2026.01.03");

		System.out.println("Уникальных Юзеров за -> " + date01 + " = " + countingNumberOfUsersForEachDate.countUniqueUsersVisits(date01, Set.of(userIvanIvanov, userPetrPetrov, userSidorSidorov)));
		System.out.println("Уникальных Юзеров за -> " + date01 + " = " +  countingNumberOfUsersForEachDate.countUniqueUsersVisits(date01, Set.of(userIvanIvanov, userPetrPetrov, userSidorSidorov)));
		System.out.println("Уникальных Юзеров за -> " + date02 + " = " +  countingNumberOfUsersForEachDate.countUniqueUsersVisits(date02, Set.of(userIvanIvanov, userPetrPetrov)));
		System.out.println("Уникальных Юзеров за -> " + date03 + " = " +  countingNumberOfUsersForEachDate.countUniqueUsersVisits(date03, Set.of(userPetrPetrov, userSidorSidorov)));
	}
}
