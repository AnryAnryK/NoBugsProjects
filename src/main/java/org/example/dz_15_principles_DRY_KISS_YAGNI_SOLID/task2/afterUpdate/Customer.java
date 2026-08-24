package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task2.afterUpdate;

public class Customer {
	private String name;
	private boolean isLoyalCustomer;

	public Customer(String name, boolean isLoyalCustomer) {
		this.name = name;
		this.isLoyalCustomer = isLoyalCustomer;
	}

	public String getName() {
		return name;
	}

	public boolean isLoyalCustomer() {
		return isLoyalCustomer;
	}
}
