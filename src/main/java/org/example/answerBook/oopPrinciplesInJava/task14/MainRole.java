package org.example.answerBook.oopPrinciplesInJava.task14;

public class MainRole {
	public static void main(String[] args) {
		Role admin = new Admin();
		Role moderator = new Moderator();
		Role user = new User();
		UserBase userBase1 = new UserBase(admin);
		UserBase userBase2 = new UserBase(moderator);
		UserBase userBase3 = new UserBase(user);

		userBase1.tryAction("погулять");
		userBase1.tryAction("чтение");

		userBase1.setRole(moderator);
		userBase1.tryAction("смена ролей");

	}
}
