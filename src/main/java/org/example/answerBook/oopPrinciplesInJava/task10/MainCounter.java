package org.example.answerBook.oopPrinciplesInJava.task10;

public class MainCounter {
	public static void main(String[] args) {
		Counter counter1 = new Counter(5);
		System.out.println("Число = " + counter1.getCount());
		counter1.increaseCount();
		System.out.println("Число = " + counter1.getCount());

		StepCounter stepCounter1 = new StepCounter(2, 5);
		System.out.println("Число = " + stepCounter1.getCount());
		stepCounter1.increaseCount();
		System.out.println("Число = " + stepCounter1.getCount());

		LimitedCounter limitedCounter = new LimitedCounter(27, 25);
		System.out.println("Число = " + limitedCounter.getCount());
		limitedCounter.increaseCount();
		System.out.println("Число = " + limitedCounter.getCount());
	}
}
