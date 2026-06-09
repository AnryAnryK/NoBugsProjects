package dz_14_ComplexTasks.task4;

import org.example.dz_14_ComplexTasks.task4.Movie;
import org.example.dz_14_ComplexTasks.task4.MovieService;
import org.example.dz_14_ComplexTasks.task4.Rating;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
	MovieService movieService1 = new MovieService();

	Movie movie1 = new Movie("Титаник");
	Movie movie2 = new Movie("Чебурашка");

	@Test
	@DisplayName("Позитивные тесты: проверка ввода корректных рейтингов")
	public void checkValidRatingsPositiveTests() {
		movieService1.addMark(movie1, new Rating<>(1.0));
		movieService1.addMark(movie1, new Rating<>(4.0));
		assertEquals(2.5, movieService1.avgMovieMark(movie1));
	}

	@Test
	@DisplayName("Позитивные тесты: проверка корректности сортировки")
	public void checkValidSortedRatingsPositiveTests() {
		movieService1.addMark(movie1, new Rating<>(1.0));
		movieService1.addMark(movie2, new Rating<>(4.0));

		List<Movie> sortedList1 = movieService1.getSortedMoviesByRating();
		assertEquals(movie2, sortedList1.get(0));
		assertEquals(movie1, sortedList1.get(1));
	}

	public static Stream<Arguments> notValidRatingsForNegativeTests() {
		return Stream.of(Arguments.of(new Rating<>(-1.0)),
				Arguments.of(new Rating<>(12.0)));
	}

	@ParameterizedTest
	@MethodSource("notValidRatingsForNegativeTests")
	@DisplayName("Негативные тесты: проверка ввода некорректных рейтингов (за пределами указанных границ рейтинга от 1 до 10)")
	public void checkNotValidRatingsNegativeTests(Rating rating) throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> movieService1.addMark(movie1, rating));

	}

	@Test
	@DisplayName("Негативные тесты: проверка ввода null для рейтингов")
	public void checkNotValidNullRatingsNegativeTests() throws IllegalArgumentException {
		assertThrows(IllegalArgumentException.class, () -> movieService1.avgMovieMark(movie1));
	}
}
