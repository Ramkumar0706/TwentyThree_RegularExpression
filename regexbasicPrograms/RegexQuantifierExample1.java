package regexbasicPrograms;

import java.util.regex.Pattern;

public class RegexQuantifierExample1 {
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println(Pattern.matches("[abc]?", "a"));
		System.out.println(Pattern.matches("[abc]?","abc" ));
		
		System.out.println();
		System.out.println(Pattern.matches("[abc]+", "aac"));
		System.out.println(Pattern.matches("[abc]+", "aabbcc"));
		
		System.out.println();
		System.out.println(Pattern.matches("[abc]*", "aaaaaccccbbbbbbbb"));
		System.out.println(Pattern.matches("[a-z]*", "ramkumar"));
		
		System.out.println();
		System.out.println(Pattern.matches("[a-z]{8}", "ramkumar"));
		System.out.println(Pattern.matches("[a-z]{4}", "ramkumar"));//false because the String is more Than 4 character
		
		System.out.println();
		System.out.println(Pattern.matches("[a-z]{5,}", "ramkumar"));
		System.out.println(Pattern.matches("[a-z]{5,}", "ram"));//false because the String is less than Five Character
		
		System.out.println();
		System.out.println(Pattern.matches("[a-z]{4,8}", "ramkumar"));
		System.out.println(Pattern.matches("[a-z]{4,8}","ram"));//false because of the not between the range
		
		
	}

}
