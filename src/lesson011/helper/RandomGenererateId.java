package lesson011.helper;

import java.util.Random;

public class RandomGenererateId {
	
	public static String generateId() {
		Random random = new Random();
		int intRandomNumber = random.nextInt(1000,10000);
		String randomId = Integer.toString(intRandomNumber);
		return randomId;
	}
}
