package org.example.dz_3_StaticFinalModificators;

public class GameSettings {

	/*
	Класс GameSettings
Создайте класс GameSettings с полями:
static int maxPlayers — общее ограничение игроков
final String gameName — название (нельзя менять)
int currentPlayers — сколько игроков в игре сейчас Реализуйте конструктор, статический метод setMaxPlayers(int),
метод addPlayer() — добавляет 1 игрока,
метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.
	*/
	public static void main(String[] args) {
		GameSettings game1 = new GameSettings(0, "Лапта");
		setMaxPlayers(3);
		game1.addPlayer();
		game1.addPlayer();
		game1.printGameStatus();

		GameSettings game2 = new GameSettings(0, "Керлинг");
		setMaxPlayers(5);
		game2.addPlayer();
		game2.addPlayer();
		game2.addPlayer();
		game2.printGameStatus();
	}

	static int maxPlayers = 5;
	final String gameName;
	int currentPlayers;

	public GameSettings(int currentPlayers, String gameName) {
		this.currentPlayers = currentPlayers;
		this.gameName = gameName;
	}

	public static void setMaxPlayers(int maxPlayers1) {
		maxPlayers = maxPlayers1;
	}

	public void addPlayer() {
		currentPlayers++;
	}

	public void printGameStatus() {
		System.out.println("Название игры : " + gameName + "; Текущее кол-во игроков : " + currentPlayers + "; Максимальное кол-во игроков : " + maxPlayers);
	}
}
