package dz_12_TestsCode.DopTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
13. Проверка, является ли строка анаграммой другой

Метод:
public boolean isAnagram(String str1, String str2) {
    if (str1 == null || str2 == null) return false;
    char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
    char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
}

Тесты:
"listen", "silent" → true
"java", "python" → false
null → false
 */


class MainTask13Test {

	public boolean isAnagram(String str1, String str2) {
		if (str1 == null || str2 == null) return false;
		char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
		char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
}

public class Task13Test {

	@Test
	@DisplayName("Позитивные тесты: Строка является анаграммой другой строки")
	public void isAnagramPositiveTests() {
		String string1 = "abcd";
		String string2 = "dcba";
		MainTask13Test mainTask13Test = new MainTask13Test();
		boolean actualStringresult = mainTask13Test.isAnagram(string1, string2);
		assertTrue(actualStringresult);
	}

	@Test
	@DisplayName("Негативные тесты: Строка не является анаграммой другой строки")
	public void isNotAnagramNegativeTests() {
		String string1 = "1abcd1";
		String string2 = "2dcba2";
		MainTask13Test mainTask13Test = new MainTask13Test();
		boolean actualStringresult = mainTask13Test.isAnagram(string1, string2);
		assertFalse(actualStringresult);
	}

	@Test
	@DisplayName("Негативные тесты: тест Строки null")
	public void nullIsNotAnagramNegativeTests() {
		String string1 = null;
		String string2 = "2dcba2";
		MainTask13Test mainTask13Test = new MainTask13Test();
		boolean actualStringresult = mainTask13Test.isAnagram(string1, string2);
		assertFalse(actualStringresult);
	}
}
