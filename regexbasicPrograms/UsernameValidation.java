package regexbasicPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name using below format to validate the user\n"
				+ "Enter the String between 6 To 20 Character and First Letter should be Captial \n"
				+ "you can enter the - and _ in between the letters but not with ending of String");
		String name=sc.next();
		boolean matches = Pattern.matches("[A-Z][A-Za-z0-9!@#$%^&*_.,?]{2,19}[^!@#$%^&*_.,?]", name);
		if(matches) 
			System.out.println("Your UserName is : "+name+" . It is Valid");
		else
			System.out.println("Your Username is : "+name+" . It is Not Valid");
	
		
	}

}
