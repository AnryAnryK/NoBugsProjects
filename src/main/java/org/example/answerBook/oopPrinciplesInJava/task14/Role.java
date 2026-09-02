package org.example.answerBook.oopPrinciplesInJava.task14;

/*
14. Пользователь и роли (Инкапсуляция + Расширяемость)
 У пользователя может быть одна из ролей: Admin, Moderator, User.
Реализуй интерфейс Role, в котором есть метод canPerform(String action).
У разных ролей — разные доступы. Возможность смены роли без изменения логики пользователя.
Пояснение: хорошая демонстрация отделения данных от логики доступа.
 */

public interface Role {
	public boolean canPerform(String action);
}
