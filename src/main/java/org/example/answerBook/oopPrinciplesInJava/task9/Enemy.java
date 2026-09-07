package org.example.answerBook.oopPrinciplesInJava.task9;

public class Enemy implements GameObject{
	@Override
	public String update() {
		return "У врага появилась новая способность";
	}

	@Override
	public String render() {
		return "Отрисовка врага (красный)";
	}
}
