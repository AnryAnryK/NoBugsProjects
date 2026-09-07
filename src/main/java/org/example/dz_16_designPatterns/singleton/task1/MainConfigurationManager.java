package org.example.dz_16_designPatterns.singleton.task1;

public class MainConfigurationManager {
	public static void main(String[] args) {
		ConfigurationManager configurationManager1 = ConfigurationManager.getInstance();
		configurationManager1.setUrlBaseData("http://vse.com");
		configurationManager1.setUserName("Иван");
		configurationManager1.setPassword("123qwe");
		configurationManager1.setClassPath("/resources");
		configurationManager1.setLogLevel("Medium");
		configurationManager1.setPathToLogFile("/resources/1");

		System.out.println("URL базы данных: " + configurationManager1.getUrlBaseData());
		System.out.println("Имя пользователя: " + configurationManager1.getUserName());
		System.out.println("Пароль: " + configurationManager1.getPassword());
		System.out.println("Путь к классам: " + configurationManager1.getClassPath());
		System.out.println("Уровень логирования: " + configurationManager1.getLogLevel());
		System.out.println("Путь к лог-файлу: " + configurationManager1.getPathToLogFile());
	}
}
