package org.example.dz_14_ComplexTasks.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieService<T extends Number> {

	private final Map<Movie, List<Rating<T>>> marksStorage = new HashMap<>();

	public synchronized void addMark(Movie movie, Rating<T> rating) {
		double ratingsForMovies = rating.getRating().doubleValue();
		if (ratingsForMovies < 1.0 || ratingsForMovies > 10) {
			throw new IllegalArgumentException("Оценка должна быть в диапазоне от 1 до 10");
		}
		marksStorage.computeIfAbsent(movie, x -> new ArrayList<>()).add(rating);
	}

	public synchronized double avgMovieMark(Movie movie) {
		List<Rating<T>> ratings = marksStorage.get(movie);
		if (ratings == null || ratings.isEmpty()) {
			throw new IllegalArgumentException("Рейтинг пока null или 'пустой' ");
		}

		return ratings.stream()
				.mapToDouble(r -> r.getRating().doubleValue())
				.average()
				.orElse(0.0);
	}

	public List<Movie> getSortedMoviesByRating() {
		return marksStorage.entrySet().stream()
				.filter(e -> !e.getValue().isEmpty())
				.sorted((e1, e2) -> Double.compare(
						average(e2.getValue()),
						average(e1.getValue())
				))
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}

	private double average(List<Rating<T>> ratings) {
		return ratings.stream()
				.mapToDouble(r -> r.getRating().doubleValue())
				.average()
				.orElse(0.0);
	}
}

