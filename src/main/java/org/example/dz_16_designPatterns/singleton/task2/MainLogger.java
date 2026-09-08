package org.example.dz_16_designPatterns.singleton.task2;

public class MainLogger {
	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.info("Подключение к Oracle");
		logger.error("NullPointerException");
		logger.warn("Работа с Vector");
	}
}
