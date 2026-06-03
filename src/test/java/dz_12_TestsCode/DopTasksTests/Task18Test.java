package dz_12_TestsCode.DopTasksTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
18. Нахождение наибольшего общего делителя (НОД)

Метод:
public int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}

Тесты:
24, 36 → 12
101, 103 → 1
0, 10 → 10
 */


class MainTask18Test {

	public int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}

public class Task18Test {

	public static Stream<Arguments> gcdData() {
		return Stream.of(Arguments.of(24, 36, 12),
				Arguments.of(101, 103, 1),
				Arguments.of(0, 10, 10));
	}

	@ParameterizedTest
	@MethodSource("gcdData")
	@DisplayName("Позитивные тесты: Нахождение наибольшего общего делителя (НОД)")
	public void gcdPositiveTests(int a, int b, int expectedResult) {
		MainTask18Test mainTask18Test = new MainTask18Test();
		int actualResult =	mainTask18Test.gcd(a, b);
		assertEquals(expectedResult, actualResult);
	}
}
