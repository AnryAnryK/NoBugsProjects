package org.example.dz_16_designPatterns.singleton.task2;

/*
Реализовать Singleton для менеджера логирования (Logger)
Описание
В приложении необходимо создать класс Logger, который будет вести журнал событий. Класс должен обеспечивать централизованный доступ
к логированию для всего приложения. Например:
Запись информации о событиях (например, успешное подключение к базе данных).
Запись ошибок (например, исключения при выполнении операций).
Запись предупреждений (например, при попытке работы с устаревшими методами).
Класс Logger должен быть реализован по паттерну Singleton, чтобы в приложении был только один экземпляр этого класса, который будет использоваться для записи логов.
 */

import java.util.ArrayList;
import java.util.List;

public class Logger {

	private static Logger logger;
	private List<String> logsList = new ArrayList<>();

	private Logger() {
	}

	public static Logger getInstance() {
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}

	public void info(String message) {
		String resultConnection = "Успешные подключения к БД: " + message;
		logsList.add(resultConnection);
		System.out.println(resultConnection);
	}

	public void error(String message) {
		String resultException = "Исключения при выполнении операций: " + message;
		logsList.add(resultException);
		System.out.println(resultException);
	}

	public void warn(String message) {
		String resultWarning = "Предупреждение при попытке работы с устаревшими методами: " + message;
		logsList.add(resultWarning);
		System.out.println(resultWarning);
	}
}
