package org.example.answerBook.oopPrinciplesInJava.task9;

public class Player implements GameObject {
	@Override
	public String update() {
		return "Уровень игрока повышен";
	}

	@Override
	public String render() {
		return "Отрисовка игрока (синий)";
	}
}
