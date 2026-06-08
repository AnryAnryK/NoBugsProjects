package dz_14_ComplexTasks;

import org.example.dz_14_ComplexTasks.InvalidUserException;
import org.example.dz_14_ComplexTasks.User;
import org.example.dz_14_ComplexTasks.UserValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task2Test {

	public static Stream<Arguments> dataForPositiveUserParametersTests() {
		return Stream.of(Arguments.of("Петя", 18, "petya@mail.com"),
				Arguments.of("ПЕТЯ", 100, "PetyA@maiL.co"),
				Arguments.of("ПетЯ", 19, "PetyA@maiL.co"));
	}

	@ParameterizedTest
	@MethodSource("dataForPositiveUserParametersTests")
	@DisplayName("Позитивные тесты: проверка корректности данных Пользователя при Включенном флаге validationEnabled = true (" +
			"поля не null; " +
			"не пустые поля; " +
			"Имя начинается на ЗАГЛАВНУЮ букву; " +
			"Возраст в пределах от 18 до 100 лет." +
			"Email соответствует стандартному формату электронной почты")

	public void testValidUserDataWithValidationIsEnabledPositiveTests(String name, Integer age, String email) throws InvalidUserException {
		User user1 = new User(name, age, email);
		UserValidator userValidator1 = new UserValidator(user1, true);
		assertDoesNotThrow(() -> userValidator1.validate());
	}

	@Test
	@DisplayName("Позитивные тесты: проверка корректности отработки флага validationEnabled = false")

	public void testValidationIsEnabledPositiveTests() throws InvalidUserException {
		User user1 = new User("", null, "");
		UserValidator userValidator1 = new UserValidator(user1, false);
		assertDoesNotThrow(() -> userValidator1.validate());
	}


	public static Stream<Arguments> dataForNegativeUserParametersWithValidationIsEnabledTests() {
		return Stream.of(Arguments.of(null, null, null),
				Arguments.of("", null, ""),
				Arguments.of("етЯ", 19, "PetyA@maiL.co"),
				Arguments.of("ПетЯ", 190, "PetyA@maiL.co"),
				Arguments.of("ПетЯ", 19, "PetyAmaiL.co")
		);
	}

	@ParameterizedTest
	@MethodSource("dataForNegativeUserParametersWithValidationIsEnabledTests")
	@DisplayName("Негативные тесты: проверка работы системы при некорректности Данных Пользователя при Включенном флаге validationEnabled = true (" +
			"поля null;" +
			"пустые поля;" +
			"Имя начинается НЕ на ЗАГЛАВНУЮ букву;" +
			"Возраст НЕ в пределах от 18 до 100 лет;" +
			"Email НЕ соответствует стандартному формату электронной почты")

	public void testNotValidUserDataWithValidationIsEnabledNegativeTests(String name, Integer age, String email) throws InvalidUserException {
		User user1 = new User(name, age, email);
		UserValidator userValidator1 = new UserValidator(user1, true);
		assertThrows(InvalidUserException.class,() -> userValidator1.validate());
	}

	public static Stream<Arguments> dataForNegativeUserParametersWithValidationIsNotEnabledTests() {
		return Stream.of(Arguments.of(null, null, null),
				Arguments.of("", null, ""),
				Arguments.of("етЯ", 19, "PetyA@maiL.co"),
				Arguments.of("ПетЯ", 190, "PetyA@maiL.co"),
				Arguments.of("ПетЯ", 19, "PetyAmaiL.co")
		);
	}

	@ParameterizedTest
	@MethodSource("dataForNegativeUserParametersWithValidationIsNotEnabledTests")
	@DisplayName("Негативные тесты: проверка работы системы при некорректности Данных Пользователя при Включенном флаге validationEnabled = true (" +
			"поля null;" +
			"пустые поля;" +
			"Имя начинается НЕ на ЗАГЛАВНУЮ букву;" +
			"Возраст НЕ в пределах от 18 до 100 лет;" +
			"Email НЕ соответствует стандартному формату электронной почты")

	public void testNotValidUserDataWithValidationIsNotEnabledNegativeTests(String name, Integer age, String email) throws InvalidUserException {
		User user1 = new User(name, age, email);
		UserValidator userValidator1 = new UserValidator(user1, false);
		assertDoesNotThrow(() -> userValidator1.validate());
	}
}
