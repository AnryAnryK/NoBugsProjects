package org.example.dz_16_designPatterns.singleton.task1;

/*
Реализовать Singleton для управления конфигурацией приложения
Описание
В приложении необходимо создать класс ConfigurationManager, который будет управлять настройками приложения, такими как:
Параметры подключения к базе данных (например, URL базы данных, имя пользователя, пароль).
Путь к папке для хранения файлов.
Настройки логирования (например, уровень логирования, путь к лог-файлу).
Класс ConfigurationManager должен быть реализован по паттерну Singleton, чтобы в приложении был только один экземпляр этого класса,
который будет предоставлять доступ к конфигурационным данным.
 */

public class ConfigurationManager {
	private String urlBaseData;
	private String userName;
	private String password;
	private String classPath;
	private String logLevel;
	private String pathToLogFile;

	private static ConfigurationManager configurationManager;

	private ConfigurationManager() {
	}

	public static ConfigurationManager getInstance() {
		if (configurationManager == null) {
			configurationManager = new ConfigurationManager();
		}
		return configurationManager;
	}

	public void setUrlBaseData(String urlBaseData) {
		this.urlBaseData = urlBaseData;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public void setPathToLogFile(String pathToLogFile) {
		this.pathToLogFile = pathToLogFile;
	}

	public String getUrlBaseData() {
		return urlBaseData;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getClassPath() {
		return classPath;
	}

	public String getLogLevel() {
		return logLevel;
	}

	public String getPathToLogFile() {
		return pathToLogFile;
	}
}
