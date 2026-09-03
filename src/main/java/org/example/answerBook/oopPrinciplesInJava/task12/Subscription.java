package org.example.answerBook.oopPrinciplesInJava.task12;

/*
12. Учёт подписки на сервис (Полиморфизм через поведение)
 Есть подписки: Basic, Premium, Family. У всех разный набор доступных функций.
Создай абстрактный класс или интерфейс Subscription, реализуй canAccess(featureName).
Реализуй возможность замены подписки у пользователя.
Пояснение: полиморфизм при одинаковом интерфейсе canAccess(), но разном поведении.
 */

public interface Subscription {
	boolean canAccess(String featureName);
}
