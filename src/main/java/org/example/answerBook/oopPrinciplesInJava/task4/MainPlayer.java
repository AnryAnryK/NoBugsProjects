package org.example.answerBook.oopPrinciplesInJava.task4;

public class MainPlayer {
	public static void main(String[] args) {
		Player player1 = new Player(100);
		System.out.println(player1);
		player1.takeDamage(25);
		System.out.println(player1);
		player1.heal(17);
		System.out.println(player1);
		System.out.println("===================================");

		Player player2 = new Player(100);
		System.out.println(player2);
		player2.takeDamage(80);
		System.out.println(player2);
		player2.heal(17000);
		System.out.println(player2);
	}
}
