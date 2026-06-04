package dz_13_TroubleShooting;

/*
Код должен напечатать числа от n до 1, но программа падает с StackOverflowError.
 */

public class DebugTask6 {
	public static void main(String[] args) {
		countdown(5);
	}

	public static void countdown(int n) {
		if (n > 0) {
			System.out.println(n);
			countdown(n - 1);
		}
	}
}
