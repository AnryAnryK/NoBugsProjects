package org.example.dz_17_designPatternsComplexTasks.task1;

public interface ShorteningStrategy {
	UrlShortenerService urlShortenerService = new UrlShortenerService();
	default void methodShorteningURLs() {

	}
}
