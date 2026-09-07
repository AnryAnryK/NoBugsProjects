package org.example.answerBook.oopPrinciplesInJava.task9;

import java.util.Arrays;
import java.util.List;

public class MainGameObject {
	public static void main(String[] args) {

		List<GameObject> gameObjectList = List.of(
				new Player(),
				new Enemy(),
				new CollectibleItem());

		for (GameObject list : gameObjectList) {
			System.out.println("=== " + list.getClass().getSimpleName() + " ===");
			System.out.println("Метод update: " + list.update());
			System.out.println("Метод render: " + list.render());
			System.out.println();
		}
	}
}
