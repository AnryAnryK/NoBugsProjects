package org.example.answerBook.oopPrinciplesInJava.task14;

import java.util.Set;

public class UserBase {
	private static final Set<String> ALLOWED_ACTIONS = Set.of("чтение");

	private Role role;

	UserBase(Role actualRole) {
		this.role = actualRole;
	}

	public void setRole(Role newRole) {
		this.role = newRole;
	}

	public Role getRole() {
		return role;
	}

	public boolean canPerform(String action) {
		return role.canPerform(action);
	}

	public void tryAction(String action) {
		boolean act = canPerform(action);
		System.out.println("Пользователь с ролью: '" + getRole().getClass().getSimpleName() + "' пробует совершить действие: '" + action + "', которое: '" + act + "'");
	}
}
