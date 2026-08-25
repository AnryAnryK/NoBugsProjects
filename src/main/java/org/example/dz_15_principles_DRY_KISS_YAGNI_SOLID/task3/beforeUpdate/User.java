package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task3.beforeUpdate;

/*
3. Нарушение YAGNI (You Ain't Gonna Need It) – ненужный код
Задача: Удалите неиспользуемые поля и оставьте только необходимые данные.
 */

public class User {
	private String name;
	private String email;
	private String phoneNumber;
	private boolean isPremiumMember;
	private int rewardPoints;
	private String preferredLanguage;
	private String homeAddress;
	private String workAddress;
	private String socialSecurityNumber; // Никогда не используется

	public User(String name, String email, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
}
