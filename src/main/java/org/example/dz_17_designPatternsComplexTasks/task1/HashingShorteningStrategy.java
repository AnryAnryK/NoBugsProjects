package org.example.dz_17_designPatternsComplexTasks.task1;

public class HashingShorteningStrategy implements ShorteningStrategy {
	@Override
	public String methodShorteningURLs(String longUrl) {
		return String.valueOf(longUrl.hashCode());
	}
}
