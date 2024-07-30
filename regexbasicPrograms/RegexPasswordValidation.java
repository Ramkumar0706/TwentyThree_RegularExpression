package regexbasicPrograms;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPasswordValidation {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Password to Verify");
		String password = scan.next();
		boolean matches = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[_!@#$&*?])[A-Za-z\\d!@#$&*?]{8,20}$",password);
		if(matches) 
			System.out.println("Your Pan Card Number is : "+password+" . It is Valid");
		else
			System.out.println("Your Pan Card Number is : "+password+" . It is Not Valid");
	
	}

}
