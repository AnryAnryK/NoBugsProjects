package dz_13_TrobleShooting;

/*
Задача 3:
Код должен напечатать числа от 1 до 5, но программа зависает.
 */

// не совсем понял - мне именно  while (i <= 5) нужно было оставить или как я сделал -  заменить цикл while на for ?

public class DebugTask3 {
	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 5; i++) {
			System.out.println("Number: " + i);
		}
	}
}
