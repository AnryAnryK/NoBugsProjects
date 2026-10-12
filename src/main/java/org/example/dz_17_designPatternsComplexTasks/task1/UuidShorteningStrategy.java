package org.example.dz_17_designPatternsComplexTasks.task1;

public class UuidShorteningStrategy implements ShorteningStrategy {
	@Override
	public String methodShorteningURLs(String longUrl) {
		return String.valueOf(longUrl.toCharArray().length);
	}
}
