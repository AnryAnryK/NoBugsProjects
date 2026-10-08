package org.example.dz_17_designPatternsComplexTasks.task1;

import java.util.HashMap;
import java.util.Map;

public interface UrlStorage {
	Map<String, String> map = new HashMap<>();

	default String memory(String shortUrl, String longUrl) {
		return map.put(shortUrl, longUrl);
	}

	default String files(String shortUrl, String longUrl) {
		return map.put(shortUrl, longUrl);
	}

	default String baseData(String shortUrl, String longUrl) {
		return map.put(shortUrl, longUrl);
	}
}
