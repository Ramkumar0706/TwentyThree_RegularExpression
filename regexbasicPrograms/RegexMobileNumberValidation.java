package regexbasicPrograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMobileNumberValidation {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Mobile Number To Verify");
		String mobileNumber=scan.next();
		Pattern pattern = Pattern.compile("[6789][0-9]{9}");
		Matcher matcher = pattern.matcher(mobileNumber);
		if(matcher.matches()) 
			System.out.println("Your Mobile Number is : "+mobileNumber+" . It is Valid");
		else
			System.out.println("Your Mobile Number is : "+mobileNumber+" . It is Not Valid");
	scan.close();
	}

}
