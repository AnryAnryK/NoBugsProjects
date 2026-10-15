package org.example.dz_17_designPatternsComplexTasks.task1;

import java.util.UUID;

public class UuidShorteningStrategy implements ShorteningStrategy {
	@Override
	public String methodShorteningURLs(String longUrl) {
		return UUID.randomUUID().toString().substring(0, 8);
	}
}
