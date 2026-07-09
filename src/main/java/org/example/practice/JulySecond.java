package org.example.practice;

/*
Список Стран:
Марокко,
Англия,
Марокко,
Англия,
Норвегия,
Норвегия,
Португалия,
Англия

 и Результат Игр.

Посчитать - Победителя.

 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JulySecond {

	public static Map<String, Integer> findWinner(List<String> lst) {

		Map<String, Integer> map1 = new HashMap<>();

		for (String country : lst) {
			map1.put(country, map1.getOrDefault(country, 0) + 1);

//			if (!map1.containsKey(country)) {
//				map1.put(country, 1);  // ("Марокко", 1);
//			} else {
//				int value = map1.get(country); // 1
//				map1.put(country, value + 1);  // ("Марокко", 2);
//			}
		}
		return map1;
	}

	public static void main(String[] args) {
		System.out.println(JulySecond.findWinner(List.of("Марокко", "Англия", "Марокко", "Англия", "Норвегия", "Норвегия", "Португалия", "Англия")));
	}
}
