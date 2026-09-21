package org.example.answerBook.collectionsInJava.task15;

/*
15. Множество товаров без повторений
 Товары нельзя повторять в списке. Необходимо обеспечить проверку на дубликаты.
 */

import java.util.HashSet;
import java.util.Set;

public class ProductsWithoutRepetition {
	private final Set<String> goods = new HashSet<>();

	public boolean addGoodIfAbsent(String good) {
		if (goods.contains(good)) {
			return false;
		}
		goods.add(good);
		return true;
	}
}
