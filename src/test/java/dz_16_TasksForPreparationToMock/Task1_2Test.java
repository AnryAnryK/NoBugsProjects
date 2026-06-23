package dz_16_TasksForPreparationToMock;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class Task1_2Test {

	@Test
	public void task2() {
		Stream<Integer> stream =
				Stream.of(1, 2, 3, 4, 5).filter(i -> i % 2 != 0);
		stream.forEach(System.out::println);
		System.out.println(stream.reduce(5, Integer::sum));
	}
}
