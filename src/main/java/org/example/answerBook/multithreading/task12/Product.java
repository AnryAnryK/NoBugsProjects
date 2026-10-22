package org.example.answerBook.multithreading.task12;

public class Product {
	private String title;
	private double price;
	private boolean hasValue;


	public synchronized void write(String title, double price) throws InterruptedException {
		System.out.println("Поток: " + Thread.currentThread().getName() + ", вошёл в write()");
		while (hasValue) {
			System.out.println("Поток: " + Thread.currentThread().getName() + ", ждёт освобождения слота");
			wait();
		}
		this.title = title;
		this.price = price;
		hasValue = true;
		System.out.println("Поток: " + Thread.currentThread().getName() + ", записал поля");
		notifyAll();
		System.out.println("Поток: " + Thread.currentThread().getName() + ", вызвал notifyAll()");
	}

	public synchronized void waitAndPrint() throws InterruptedException {
		System.out.println("Поток: " + Thread.currentThread().getName() + ", вошёл в waitAndPrint()");
		while (hasValue == false) {
			System.out.println("Поток: " + Thread.currentThread().getName() + ", значение false, иду ждать");
			wait();
			System.out.println("Поток: " + Thread.currentThread().getName() + ", снова проверяю значение");
		}
		System.out.println("Поток: " + Thread.currentThread().getName() + ", Товар: " + title + ", цена: " + price);
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product{" +
				"title='" + title + '\'' +
				", price=" + price +
				'}';
	}
}
