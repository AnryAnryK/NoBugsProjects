package org.example.dz_17_designPatternsComplexTasks.task1;

public class UrlShortenerService {
	private String shortUrl = "https://ya.ru";
	private String longUrl = "https://yandex.ru";

	private static UrlShortenerService urlShortenerService;

	private UrlShortenerService() {
	}

	public static UrlShortenerService getInstance() {
		if (urlShortenerService == null) {
			urlShortenerService = new UrlShortenerService();
		}
		return urlShortenerService;
	}

	public String makeLongUrl() {
		shortUrl = longUrl;
		return shortUrl;
	}

	public String makeShortUrl() {
		longUrl = shortUrl;
		return longUrl;
	}
}
