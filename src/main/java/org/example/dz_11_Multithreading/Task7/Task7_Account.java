package org.example.dz_11_Multithreading.Task7;


import java.util.concurrent.locks.ReentrantLock;

class Task7_Account {

	private int balance = 0;
	static final ReentrantLock reentrantLock = new ReentrantLock();


	public Task7_Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}


//	public void changeBalance(int amount) {
//		this.balance = balance + amount;
//	}


	public void transfer(Task7_Account toAccount, int amount) {
		reentrantLock.lock();

		try {
			if (this.balance >= amount) {
				this.balance -= amount;
				toAccount.balance += amount;
				System.out.println(Thread.currentThread().getName() + " | УСПЕХ: Перевод " + amount + " осуществлен.");
			} else System.out.println(Thread.currentThread().getName() + " | ОТКАЗ: Недостаточно средств на счете " + this.balance);
			System.out.println("Сумма на списанном балансе: " + balance);
			System.out.println("Сумма на пополненном балансе: " + toAccount.balance);

		} finally {
			reentrantLock.unlock();
		}
	}
}
