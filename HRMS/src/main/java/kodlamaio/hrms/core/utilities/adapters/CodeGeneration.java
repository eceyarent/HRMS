package kodlamaio.hrms.core.utilities.adapters;

import java.util.Random;

public class CodeGeneration {
	
	public String create() {
		int leftLimit = 100;
		int rightLimit = 150;
		int targetStringLength = 30;
		Random random = new Random();
		
		String generatedString = random.ints(leftLimit, rightLimit+1)
				.limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
				.toString();
		return generatedString;
	}

}
