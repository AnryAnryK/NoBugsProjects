//package org.example.dz_15_principles_DRY_KISS_YAGNI_SOLID.task2.afterUpdate;
//
///*
//2. Нарушение KISS (Keep It Simple, Stupid) – чрезмерно сложный код
//Задача: Упростите код, убрав вложенные условия, сделав его более читаемым и поддерживаемым.
// */
//
//public class DiscountCalculator {
//	public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
//		double discount = 0.0;
//
//		if (isLoyalCustomer) {
//			if (isFirstPurchase) {
//				discount = price * 0.10;
//			} else {
//				discount = price * 0.05;
//			}
//		} else {
//			if (hasCoupon) {
//				discount = price * 0.07;
//			} else {
//				discount = price * 0.02;
//			}
//		}
//		return price - discount;
//	}
//}
