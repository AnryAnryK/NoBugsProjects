package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.randomizer;

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
		return RandomStringUtils.randomAlphabetic(0);
	}

	public static String getInvalidUsernameWithSymbol() {
		return RandomStringUtils.randomAlphabetic(10) + "!@#$%";
	}

	public static String getInvalidUsernameWithSpaces() {
		return RandomStringUtils.randomAlphabetic(10) + "     " + RandomStringUtils.randomAlphabetic(10);
	}

	public static int setBalance() {
		return RandomUtils.nextInt(1, 100);
	}

	public static int setBalance0() {
		return RandomUtils.nextInt(0, 0);
	}

	public static int setBalanceMinus0() {
		return -RandomUtils.nextInt(1, 1000);
	}

	public static int setBalanceUnderMax5000() {
		return RandomUtils.nextInt(5001, 99999);
	}

	public static int setBalance5000() {
		return 5000;
	}
	public static double setBalance4999and99() {
		return 4999.99;
	}

	public static double setAmount9999and99() {
		return 9999.99;
	}

	public static double setAmount10000() {
		return 10000;
	}

	public static double setAmountMore10000() {
		return RandomUtils.nextDouble(10001, 99999);
	}
	public static double setAmount00and01() {
		return 00.01;
	}
	public static double setAmount() {
		return RandomUtils.nextDouble(1, 100);
	}

	public static int setInvalidAccountId() {
		return RandomUtils.nextInt(999, 9999);
	}
}
