package org.example.answerBook.oopPrinciplesInJava.task12;

public class MainSubscription {
	public static void main(String[] args) {
		Basic basic = new Basic();
		Premium premium = new Premium();
		Family family = new Family();

		User user1 = new User("Иван");
		user1.setSubscription(basic);
		System.out.println(user1.getUserName());
		System.out.println(user1.getSubscription().getClass().getSimpleName());
		System.out.println(user1.canAccess("смотреть фильмы"));
		System.out.println("Пользователь " + user1.getUserName() + " имеет доступ к Базовой подписке " + user1.canAccess("смотреть фильмы"));

		user1.setSubscription(premium);
		System.out.println("Пользователь " + user1.getUserName() + " имеет доступ к Базовой подписке " + user1.canAccess("делиться фильмами"));
		System.out.println("Пользователь " + user1.getUserName() + " имеет доступ к Премиальной подписке " + user1.canAccess("покупать фильмы"));
	}
}
