package org.example.mockInterview.exception;

public class MyException1 extends Exception {
	public MyException1(String message) {
		super(message);
	}


	public static int divisionOnZero(int a, int b) throws MyException1 {
		if (b == 0) {
			throw new MyException1("Пользовательское исключение: деление на 0 (ноль) !");
		}
		return a / b;
	}

	public static void main(String[] args) throws MyException1 {
		try {
			System.out.println(divisionOnZero(5,0));
		} catch (MyException1 e) {
			System.out.println(e.getMessage());
		}
	}
}
