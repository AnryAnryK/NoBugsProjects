package dz_16_TasksForPreparationToMock;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class Task1_1Test {

	@Test
	public void task1() {
		Stream.of("d2", "a2", "b1", "b3", "c")
				.map(s -> {
					System.out.println("map: " + s);
					return s.toUpperCase();
				})
				.anyMatch(s -> {
					System.out.println("anyMatch: " + s);
					return s.startsWith("A");
				});
	}
}
