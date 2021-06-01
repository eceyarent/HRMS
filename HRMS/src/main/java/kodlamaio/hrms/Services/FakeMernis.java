package kodlamaio.hrms.Services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FakeMernis {

public static boolean validate(String idNo) {
		
		String regex = "^[0-9]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(idNo);
		
		if(idNo.length() > 11) {
			return false;
		}
		
		else if(matcher.matches() && !idNo.startsWith("0")) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
}
