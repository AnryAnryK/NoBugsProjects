package org.example.dz_17_designPatternsComplexTasks.task1;

public class Main {
	public static void main(String[] args) {

		UrlShortenerService urlShortenerService1 = new UrlShortenerService(new ShortenerFactory(new Base62ShorteningStrategy()));
		String shortUrl1 = urlShortenerService1.shortenUrl("https://yandex.ru/");
		System.out.println("Преобразование из Длинного URL в Короткий: " + shortUrl1);
		System.out.println("Преобразование из Короткого URL в Длинный: " + urlShortenerService1.expandUrl(shortUrl1));

		UrlShortenerService urlShortenerService2 = new UrlShortenerService(new ShortenerFactory(new HashingShorteningStrategy()));
		String shortUrl2 = urlShortenerService2.shortenUrl("https://yandex.ru/");
		System.out.println("Преобразование из Длинного URL в Короткий: " + shortUrl2);
		System.out.println("Преобразование из Короткого URL в Длинный: " + urlShortenerService2.expandUrl(shortUrl2));

		UrlShortenerService urlShortenerService3 = new UrlShortenerService(new ShortenerFactory(new UuidShorteningStrategy()));
		String shortUrl3 = urlShortenerService3.shortenUrl("https://yandex.ru/");
		System.out.println("Преобразование из Длинного URL в Короткий: " + shortUrl3);
		System.out.println("Преобразование из Короткого URL в Длинный: " + urlShortenerService3.expandUrl(shortUrl3));
	}
}
