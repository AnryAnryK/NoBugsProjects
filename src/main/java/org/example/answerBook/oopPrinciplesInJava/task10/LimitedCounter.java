package org.example.answerBook.oopPrinciplesInJava.task10;

public class LimitedCounter extends Counter {
	private int maxcount = 25;

	public LimitedCounter(int count, int maxcount) {
		super(count);
		this.maxcount = maxcount;
		if (count > maxcount) {
			System.out.println("Максимальное число не может быть больше " + maxcount);
			setCount(maxcount);
		}
	}

	@Override
	public int increaseCount() {
		int count = getCount();
		if (count < maxcount) {
			setCount(count + 1);
		} else {
			System.out.println("Максимальное число не может быть больше " + maxcount);
		}
		return getCount();
	}
}
