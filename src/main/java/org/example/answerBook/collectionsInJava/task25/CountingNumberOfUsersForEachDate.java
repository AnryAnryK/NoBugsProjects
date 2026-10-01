package org.example.answerBook.collectionsInJava.task25;

/*
25. Подсчёт количества пользователей на каждую дату
 Храни даты и количество входов пользователей на них. Обновляй счётчик по мере поступления данных.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountingNumberOfUsersForEachDate {

	Map<Date, Set<User>> map = new HashMap<>();

	public int countUniqueUsersVisits(Date date, Set<User> user) {
		if (!map.containsKey(date)) {
			map.put(date, new HashSet<>(user));
		} else {
			map.get(date).addAll(user);
		}
		return map.get(date).size();
	}
}
