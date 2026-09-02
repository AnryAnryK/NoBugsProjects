package org.example.answerBook.oopPrinciplesInJava.task14;

import java.util.Set;

public class User implements Role {
	private static final Set<String> ALLOWED_ACTIONS = Set.of("чтение");

	@Override
	public boolean canPerform(String action) {
		return ALLOWED_ACTIONS.contains(action);
	}
}
