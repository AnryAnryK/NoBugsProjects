package org.example.answerBook.oopPrinciplesInJava.task12;

import java.util.Set;

public class Premium implements Subscription {
	private String premium = "Премиальная подписка";
	private Set<String> premiumSubscription = Set.of("смотреть фильмы", "покупать фильмы");

	@Override
	public boolean canAccess(String featureName) {
		return premiumSubscription.contains(featureName);
	}
}
