package Assignment2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your e-mail address : ");
		String input=sc.next();
		String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern p=Pattern.compile(regex);
		Matcher matcher=p.matcher(input);
		if(matcher.matches()) {
			System.out.println("Yess!! it's a valid e-mail.");
		}
		else {
			System.out.println("No it's not a valid e-mail.");
		}
		
		

	}

}
