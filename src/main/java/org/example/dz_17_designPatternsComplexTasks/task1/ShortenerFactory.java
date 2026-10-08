package org.example.dz_17_designPatternsComplexTasks.task1;

public class ShortenerFactory {
	private ShorteningStrategy shorteningStrategy;

	public ShortenerFactory(ShorteningStrategy shorteningStrategy) {
		this.shorteningStrategy = shorteningStrategy;
	}

	public void setShorteningStrategy(ShorteningStrategy shorteningStrategy) {
		this.shorteningStrategy = shorteningStrategy;
	}

	public void methodShorteningURLs() {
		shorteningStrategy.methodShorteningURLs();
	}
}
