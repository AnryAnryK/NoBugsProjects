package org.example.dz_17_designPatternsComplexTasks.task1;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUrlStorage implements UrlStorage {
	private static InMemoryUrlStorage inMemoryUrlStorage;
	Map<String, String> longToShort = new HashMap<>();
	Map<String, String> shortToLong = new HashMap<>();

	private InMemoryUrlStorage() {
	}

	public static InMemoryUrlStorage getInstance() {
		if (inMemoryUrlStorage == null) {
			inMemoryUrlStorage = new InMemoryUrlStorage();
		}
		return inMemoryUrlStorage;
	}

	@Override
	public void saveUrl(String longUrl, String shortUrl) {
		longToShort.put(longUrl, shortUrl);
		shortToLong.put(shortUrl, longUrl);
	}

	@Override
	public String getLongUrl(String shortUrl) {
		return shortToLong.get(shortUrl);
	}

	@Override
	public String getShortUrl(String longUrl) {
		return longToShort.get(longUrl);
	}
}
