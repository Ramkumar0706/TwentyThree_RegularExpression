package regexbasicPrograms;

import java.util.regex.Pattern;

public class RegexMetaCharacterExample1 {
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches("\\d*", "90034"));
		System.out.println(Pattern.matches("\\d", "d"));
		
		System.out.println();
		System.out.println(Pattern.matches("\\D*", "ramkumar"));
		System.out.println(Pattern.matches("\\D", "1"));
		
		System.out.println();
		System.out.println(Pattern.matches("\\s*", "    "));
		System.out.println(Pattern.matches("\\s*","the programming is very tough"));
		
		System.out.println();
		System.out.println(Pattern.matches("\\S*","the"));
		
		System.out.println();
		System.out.println(Pattern.matches("\\w*", "ramkumar"));
		
		System.out.println(Pattern.matches("\\W*", "@#$%"));
		
		System.out.println();
		System.out.println(Pattern.matches("\\b", "the word"));
		
		
	}

}
