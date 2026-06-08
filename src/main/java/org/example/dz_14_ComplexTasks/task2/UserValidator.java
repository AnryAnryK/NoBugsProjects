package org.example.dz_14_ComplexTasks.task2;

import java.util.regex.Pattern;

public class UserValidator {
	private final User user;
	boolean validationEnabled;

	public UserValidator(User user, boolean validationEnabled) {
		this.user = user;
		this.validationEnabled = validationEnabled;
	}


	public void checkUserName() throws InvalidUserException {
		String userName = user.getName();
		if (userName == null || userName.isEmpty() || !Character.isUpperCase(userName.charAt(0))) {
			throw new InvalidUserException("Имя пользователя не соответствует требованиям: ");
		}
	}

	public void checkUserAge() throws InvalidUserException {
		Integer userAge = user.getAge();
		if (userAge == null || userAge < 18 || userAge > 100) {
			throw new InvalidUserException("Возраст пользователя не соответствует требованиям: ");
		}
	}

	public void checkUserEmail() throws InvalidUserException {
		String userEmail = user.getEmail();
		if (userEmail == null || userEmail.isEmpty() || !Pattern.matches("^[\\w.+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", userEmail)) {
			throw new InvalidUserException("Электронная почта пользователя не соответствует требованиям: ");
		}
	}

	public void validate() throws InvalidUserException {
		if (!validationEnabled) {
			return;
		}
		checkUserName();
		checkUserAge();
		checkUserEmail();
	}
}


