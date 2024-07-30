package regexbasicPrograms;

import java.util.regex.Pattern;

public class RegexCharacterClassExample3 {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(Pattern.matches("[abc]", "amy"));// false it more than one character
		System.out.println(Pattern.matches("[abc]", "a"));
		
		System.out.println();
		System.out.println(Pattern.matches("[^abc]", "m"));
		System.out.println(Pattern.matches("[^abc]", "rmy"));// false it more than one character
		
		System.out.println();
		System.out.println(Pattern.matches("[a-zA-Z]", "c"));
		System.out.println(Pattern.matches("[a-zA-Z]", "D"));
		System.out.println(Pattern.matches("[a-dm-z]", "e"));
		
		System.out.println();
		System.out.println(Pattern.matches("[a-d[m-y]]", "c"));
		System.out.println(Pattern.matches("[a-d[m-y]]", ""));
		
		System.out.println();
		System.out.println(Pattern.matches("[a-z&&[D-M]]", "E"));
		System.out.println(Pattern.matches("[a-z&&[d-m]]", "e"));
		
		System.out.println();
		System.out.println(Pattern.matches("[a-z&&[^aeiou]]", "p"));
		System.out.println(Pattern.matches("[a-z&&[^a-m]]", "p"));
		
	}

}
