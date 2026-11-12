package org.example.partThree.api.dz.apiTestCaseDesign.Iteration2.apiMiddle.randomizer;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

public class RandomData {
	private RandomData() {
	}

	public static String getUsername() {
		return RandomStringUtils.randomAlphabetic(10);
	}

	public static String getNewUsername() {
		return RandomStringUtils.randomAlphabetic(10) + " " + RandomStringUtils.randomAlphabetic(10);
	}

	public static String getPassword() {
		return RandomStringUtils.randomAlphabetic(3).toUpperCase() +
				RandomStringUtils.randomAlphabetic(5).toLowerCase() +
				RandomStringUtils.randomNumeric(3) + "$";
	}
	public static int setBalance() {
		return RandomUtils.nextInt(1, 4);
	}
}
