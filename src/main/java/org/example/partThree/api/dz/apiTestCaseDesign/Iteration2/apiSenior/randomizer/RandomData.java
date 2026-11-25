package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiSenior.randomizer;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class RandomData {
	private RandomData() {
	}

	public static String getUsername() {
		return RandomStringUtils.randomAlphabetic(10);
	}

	public static String getNewUsername30Plus30Characters() {
		return RandomStringUtils.randomAlphabetic(30) + " " + RandomStringUtils.randomAlphabetic(30);
	}

	public static String getNewUsername10Plus10Characters() {
		return RandomStringUtils.randomAlphabetic(10) + " " + RandomStringUtils.randomAlphabetic(10);
	}

	public static String getNewUsername1Plus1Characters() {
		return RandomStringUtils.randomAlphabetic(1) + " " + RandomStringUtils.randomAlphabetic(1);
	}

	public static String getPassword() {
		return RandomStringUtils.randomAlphabetic(3).toUpperCase() +
				RandomStringUtils.randomAlphabetic(5).toLowerCase() +
				RandomStringUtils.randomNumeric(3) + "$";
	}

	public static String getInvalidEmptyUsername() {
		return "";
	}

	public static String getInvalidUsernameWithSymbol() {
		return RandomStringUtils.randomAlphabetic(10) + "!@#$%";
	}

	public static String getInvalidUsernameWithSpaces() {
		return RandomStringUtils.randomAlphabetic(10) + "     " + RandomStringUtils.randomAlphabetic(10);
	}

	public static double getBalance() {
		return RandomUtils.nextDouble(1, 100);
	}

	public static double getBalanceMinus0() {
		return -RandomUtils.nextDouble(1, 1000);
	}

	public static double getBalanceMoreThanMax5000() {
		return RandomUtils.nextDouble(5001, 99999);
	}

	public static double getAmountMore10000() {
		return RandomUtils.nextDouble(10001, 99999);
	}

	public static double getAmount() {
		return RandomUtils.nextDouble(1, 100);
	}

	public static int getInvalidAccountId() {
		return RandomUtils.nextInt(999, 9999);
	}
}
