package org.example.answerBook.multithreading.task7;

public class MainDownloadWithDelay {
	public static void main(String[] args) throws InterruptedException {
		DownloadWithDelay downloadWithDelay = new DownloadWithDelay();

		Runnable task = () -> {
			downloadWithDelay.download();
		};

		Thread thread = new Thread(task);
		thread.start();
		thread.join();
	}
}
