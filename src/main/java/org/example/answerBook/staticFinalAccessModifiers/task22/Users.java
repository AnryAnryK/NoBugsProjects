package org.example.answerBook.staticFinalAccessModifiers.task22;

/*
22. Роли пользователя как фиксированные значения
 Создай структуру, где перечислены возможные роли пользователей в системе ("admin", "user", "moderator", и т.д.).
Эти значения должны быть доступны в любом месте и не должны меняться.
Пояснение: используй способ задания констант в классе или интерфейсе.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Users {

	private static final List<String> userRoles = Collections.unmodifiableList(Arrays.asList("admin", "user", "moderator"));

	public static List<String> getUserRoles() {
		return userRoles;
	}
}
