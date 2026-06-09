package org.example.dz_14_ComplexTasks.task4;

/*
Задача 4: Рейтинг фильмов

Описание:
Разработайте систему, которая позволяет пользователям ставить оценки фильмам и управлять этими оценками. Система должна поддерживать использование
различных типов рейтингов, таких как целые числа или дробные значения, и предоставлять функциональность для расчёта средней оценки фильма,
а также для сортировки фильмов по популярности.

Функциональные требования:

Классы и интерфейсы:
+ ? Movie: Класс, представляющий фильм с полями для названия и других характеристик.
+ ? Rating<T extends Number>: Класс для хранения рейтинга фильма. T может быть Integer, Double и т.д.

+ MovieService: Сервис для управления фильмами и их рейтингами.
Управление рейтингами:
+ Хранение оценок в Map<Movie, List<Rating>>.
Метод для добавления оценки к фильму.
Метод должен быть потокобезопасным и валидировать оценку на допустимость (например, оценка должна быть в пределах от 1 до 10).
Возможность расчета средней оценки для каждого фильма.

Обработка данных:
Использование Stream API для подсчёта средней оценки.
Использование Stream API и лямбда-выражений для сортировки фильмов по средней оценке.

 */

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

public class Movie {
	private  final String movieName;

	public Movie(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieName() {
		return movieName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Movie movie = (Movie) o;
		return Objects.equals(movieName, movie.movieName);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(movieName);
	}
}
