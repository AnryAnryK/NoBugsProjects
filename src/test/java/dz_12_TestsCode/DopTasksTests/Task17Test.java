package dz_12_TestsCode.DopTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
17. Проверка корректности пароля (длина, символы, цифры)

Метод:
public boolean isValidPassword(String password) {
    if (password == null || password.length() < 8) return false;
    return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
}

Тесты:
"Password1" → true
"pass" → false
null → false
 */


class MainTask17Test{

	public boolean isValidPassword(String password) {
		if (password == null || password.length() < 8) return false;
		return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
	}
}

public class Task17Test {
	@Test
	@DisplayName("Позитивные тесты: Пароль к допустимыми символами по написанию и их количеству не менее 8")
	public void checkIsValidPasswordPositiveTests(){
		MainTask17Test mainTask17Test = new MainTask17Test();
		String validPassword = "FfvvFF111";
		boolean actualTrueResult = mainTask17Test.isValidPassword(validPassword);
		assertTrue(actualTrueResult);
	}

	@Test
	@DisplayName("Негативные тесты: Пароль к допустимыми символами по написанию и их количеству менее 8")
	public void checkIsNotValidPasswordWithSymbolsLessThan8NegativeTests(){
		MainTask17Test mainTask17Test = new MainTask17Test();
		String notValidPassword = "Ffvv";
		boolean actualTrueResult = mainTask17Test.isValidPassword(notValidPassword);
		assertFalse(actualTrueResult);
	}

	@Test
	@DisplayName("Негативные тесты: Пароль к допустимыми символами по написанию и их количеству = null")
	public void checkIsNotValidPasswordWithNullNegativeTests(){
		MainTask17Test mainTask17Test = new MainTask17Test();
		String notValidPassword = null;
		boolean actualTrueResult = mainTask17Test.isValidPassword(notValidPassword);
		assertFalse(actualTrueResult);
	}
}
