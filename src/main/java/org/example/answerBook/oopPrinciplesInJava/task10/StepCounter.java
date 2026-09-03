package org.example.answerBook.oopPrinciplesInJava.task10;

public class StepCounter extends Counter {
private final int step;

	public StepCounter(int count, int step) {
		super(count);
		this.step = step;
	}

	@Override
	public int increaseCount() {
		int count = getCount();
		int newcount = count + step;
		setCount(newcount);
		return newcount;
	}
}
