package org.example.answerBook.oopPrinciplesInJava.task12;

import java.util.Set;

public class Family implements Subscription {
	private String family = "Семейная подписка";
	private Set<String> familySubscription = Set.of("смотреть фильмы", "покупать фильмы", "делиться фильмами");

	@Override
	public boolean canAccess(String featureName) {
		return familySubscription.contains(featureName);
	}
}
