package org.example.answerBook.oopPrinciplesInJava.task9;

public class CollectibleItem implements GameObject{
	@Override
	public String update() {
		return "Игровой предмет стал дороже";
	}

	@Override
	public String render() {
		return "Отрисовка предмета (золотой)";
	}
}
