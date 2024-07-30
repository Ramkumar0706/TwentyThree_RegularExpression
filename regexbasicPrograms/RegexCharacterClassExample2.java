package regexbasicPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCharacterClassExample2 {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("java");
		Matcher matcher = pattern.matcher("Welocme to java here the java regex pattern will teach in java session");

		while(matcher.find()) {
			System.out.println(matcher.start()+"-"+matcher.end());
		}

	}

}