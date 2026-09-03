package org.example.answerBook.oopPrinciplesInJava.task12;

import java.util.Set;

public class Basic implements Subscription {
	private String base = "Базовая подписка";
	private Set<String> baseSubscription = Set.of("смотреть фильмы");


	@Override
	public boolean canAccess(String featureName) {
		return baseSubscription.contains(featureName);
	}
}
