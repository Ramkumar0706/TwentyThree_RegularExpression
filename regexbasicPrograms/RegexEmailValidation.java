package regexbasicPrograms;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexEmailValidation {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Email to Verify");
		String email=scan.next();
		boolean matches = Pattern.matches("[a-z][a-z0-9_]{1,30}@[a-z]+.[a-z]{2,4}", email);
		if(matches) 
			System.out.println("Your Email is : "+email+" . It is Valid");
		else
			System.out.println("Your Email is : "+email+" . It is Not Valid");
	
	}

}
