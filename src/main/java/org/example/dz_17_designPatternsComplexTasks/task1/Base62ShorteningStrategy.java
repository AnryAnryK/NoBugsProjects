package org.example.dz_17_designPatternsComplexTasks.task1;

public class Base62ShorteningStrategy implements ShorteningStrategy {
	@Override
	public String methodShorteningURLs(String longUrl) {
		return Long.toString(Math.abs((long) longUrl.hashCode()), 62);
	}
}
