package dz_12_TestsCode.DopTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
16. Разбиение строки на части по разделителю

Метод:
public String[] splitString(String input, String delimiter) {
    return input.split(delimiter);
}

Тесты:
"Java,Python,C++", "," → ["Java", "Python", "C++"]
"", "," → [""]
"word", "," → ["word"]
 */


class MainTask16Test {

	public String[] splitString(String input, String delimiter) {
		return input.split(delimiter);
	}
}

public class Task16Test {

	@Test
	@DisplayName("Позитивные тесты: Разбиение простой строки на части по разделителю")
	public void splitSimpleStringPositiveTests() {
		MainTask16Test mainTask16Test = new MainTask16Test();
		String inputString = "Раз, Два, Три";
		String delimiter = ",";
		String[] actualResultOfDelimiterString = mainTask16Test.splitString(inputString, delimiter);
		String[] expectedResultOfDelimiterString = {"Раз", " Два", " Три"};
		assertArrayEquals(expectedResultOfDelimiterString, actualResultOfDelimiterString);
	}

	@Test
	@DisplayName("Позитивные тесты: Разбиение пустой строки на части по разделителю")
	public void splitEmptyStringPositiveTests() {
		MainTask16Test mainTask16Test = new MainTask16Test();
		String inputString = "";
		String delimiter = ",";
		String[] actualResultOfDelimiterString = mainTask16Test.splitString(inputString, delimiter);
		String[] expectedResultOfDelimiterString = {""};
		assertArrayEquals(expectedResultOfDelimiterString, actualResultOfDelimiterString);
	}

	@Test
	@DisplayName("Позитивные тесты: Разбиение строки с одним элементом на части по разделителю")
	public void splitStringWithOneElementPositiveTests() {
		MainTask16Test mainTask16Test = new MainTask16Test();
		String inputString = "abba";
		String delimiter = ",";
		String[] actualResultOfDelimiterString = mainTask16Test.splitString(inputString, delimiter);
		String[] expectedResultOfDelimiterString = {"abba"};
		assertArrayEquals(expectedResultOfDelimiterString, actualResultOfDelimiterString);
	}
}
