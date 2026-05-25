package org.example.dz_11_Multithreading.Task7;


public class Task7_Transaction implements Runnable {

	Task7_Account toTask7Account;
	Task7_Account fromTask7Account;
	int amount;

	public Task7_Transaction(Task7_Account fromTask7Account, Task7_Account toTask7Account, int amount) {
		this.fromTask7Account = fromTask7Account;
		this.toTask7Account = toTask7Account;
		this.amount = amount;
	}


	@Override
	public void run() {
		fromTask7Account.transfer(toTask7Account, amount);
	}
}
