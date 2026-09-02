package org.example.answerBook.oopPrinciplesInJava.task14;

import java.util.Set;

public class Moderator implements Role {
	private static final Set<String> ALLOWED_ACTIONS = Set.of("чтение", "изменение", "удаление");

	@Override
	public boolean canPerform(String action) {
		return ALLOWED_ACTIONS.contains(action);
	}
}
