package org.example.dz_17_designPatternsComplexTasks.task1;

public class Main {
	public static void main(String[] args) {
		UrlShortenerService.getInstance();

		ShortenerFactory shortenerFactory = new ShortenerFactory(new Base62ShorteningStrategy());
		shortenerFactory.methodShorteningURLs();

		shortenerFactory.setShorteningStrategy(new HashingShorteningStrategy());
		shortenerFactory.methodShorteningURLs();

		shortenerFactory.setShorteningStrategy(new UuidShorteningStrategy());
		shortenerFactory.methodShorteningURLs();
	}
}
