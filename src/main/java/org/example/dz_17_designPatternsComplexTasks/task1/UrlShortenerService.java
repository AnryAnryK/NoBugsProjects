package org.example.dz_17_designPatternsComplexTasks.task1;

/*
Разработка библиотеки для сокращения URL
Цель: Разработать библиотеку, которая предоставляет функциональность для сокращения длинных URL и их восстановления.
Библиотека должна быть гибкой, чтобы в будущем можно было легко добавлять новые методы сокращения.

Паттерны проектирования:
Singleton: Единственное хранилище всех URL.
Factory Method: Для создания объектов, отвечающих за различные методы сокращения URL.
Strategy: Для переключения между способами сокращения URL.

Архитектура библиотеки:
UrlShortenerService: Класс, отвечающий за логику сокращения и восстановления URL.
UrlStorage: Интерфейс для хранения пар "длинный URL - короткий URL", с различными реализациями (например, память, файлы, базы данных).
ShorteningStrategy: Интерфейс, который определяет метод для сокращения URL. Реализации могут включать Base62, хеширование, UUID и другие.
ShortenerFactory: Класс, использующий Factory Method для создания объектов ShorteningStrategy.

Пример использования:
см. файл task1.png
 */

public class UrlShortenerService {

	private InMemoryUrlStorage inMemoryUrlStorage;
	private ShortenerFactory shortenerFactory;

	UrlShortenerService(ShortenerFactory shortenerFactory) {
		this.inMemoryUrlStorage = InMemoryUrlStorage.getInstance();
		this.shortenerFactory = shortenerFactory;
	}

	public String shortenUrl(String longUrl) {
		String shortUrl = shortenerFactory.methodShorteningURLs(longUrl);
		inMemoryUrlStorage.saveUrl(longUrl, shortUrl);
		return shortUrl;
	}

	public String expandUrl(String shortUrl) {
		String longUrl = inMemoryUrlStorage.getLongUrl(shortUrl);
		return longUrl;
	}
}
