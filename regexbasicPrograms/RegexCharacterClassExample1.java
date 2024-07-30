package regexbasicPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCharacterClassExample1 {
	
	public static void main(String[] args) {
		
		
		//First Way
		Pattern pattern = Pattern.compile(".s");
		Matcher matcher = pattern.matcher("rs");
		System.out.println(matcher.matches());
		
		//Second Way
		boolean matches = Pattern.compile("..m").matcher("ram").matches();
		boolean matches1 = Pattern.compile("..m").matcher("ramkumar").matches();// false because it have more than three character
		System.out.println(matches);
		System.out.println(matches1);
		
		//ThridWay
		boolean matches2 = Pattern.matches(".am", "Ram");
		System.out.println(matches2);
		
		
	}

}
