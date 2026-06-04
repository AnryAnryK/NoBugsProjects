package dz_13_TroubleShooting;

/*
Код должен сравнить два числа, но почему-то результат не соответствует ожиданиям.
 */

import java.math.BigDecimal;

public class DebugTask8 {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("0.1").multiply(new BigDecimal("3"));
		BigDecimal b = new BigDecimal("0.3");

		int result = a.compareTo(b);

		if (result == 0) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
