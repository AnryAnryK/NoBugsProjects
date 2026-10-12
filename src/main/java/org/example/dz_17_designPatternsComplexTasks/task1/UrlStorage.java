package org.example.dz_17_designPatternsComplexTasks.task1;

public interface UrlStorage {
	void saveUrl(String longUrl, String shortUrl);

	String getLongUrl(String shortUrl);

	String getShortUrl(String longUrl);
}
