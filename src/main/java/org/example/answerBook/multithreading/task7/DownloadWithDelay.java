package org.example.answerBook.multithreading.task7;

/*
7. Скачивание с задержкой
 Имитация загрузки файла: поток "скачивает" файл за 5 секунд (Thread.sleep(5000)) и выводит сообщение о завершении.
 */

public class DownloadWithDelay {

	public void download() {
		System.out.println("Скачивание файла");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Скачивание завершено");
	}
}
