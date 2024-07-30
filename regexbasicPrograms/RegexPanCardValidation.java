package regexbasicPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPanCardValidation {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the pancard number to verify the format");
		String panCard=scan.next();
		Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
		Matcher matcher = pattern.matcher(panCard);
		if(matcher.matches()) 
			System.out.println("Your Pan Card Number is : "+panCard+" . It is Valid");
		else
			System.out.println("Your Pan Card Number is : "+panCard+" . It is Not Valid");
	
	}
}