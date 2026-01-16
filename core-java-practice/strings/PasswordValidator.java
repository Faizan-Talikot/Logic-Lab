package core-java-practice.strings;

import java.util.Scanner;

public class PasswordValidator {
	
	private static boolean isValid(String userName, String pwd) {
		if(pwd.length() <8 || pwd.length() > 20) return false;
		if(pwd.contains(" ")) return false;
		if(pwd.toLowerCase().contains(userName.toLowerCase())) return false;
		boolean upper = false, lower = false, digit = false, special = false;
		String specialChars = "!@#$%^&*";
		for(char c : pwd.toCharArray()) {
			if(Character.isDigit(c)) digit = true;
			else if(Character.isLowerCase(c)) lower = true;
			else if(Character.isUpperCase(c)) upper = true;
			else if(specialChars.indexOf(c)>=0) special = true;
		}
		return upper && lower && digit && special;
	}
	
	private static String feedBack(String userName, String pwd) {
		StringBuilder sb = new StringBuilder("Feedback:\n");
		if(pwd.length() <8 || pwd.length() > 20) {
			sb.append("- Password must be between 8 and 20 characters.\n");
		}
		if(pwd.contains(" ")) {
			sb.append("- Must not contain spaces.\n");
		}
		if(pwd.toLowerCase().contains(userName.toLowerCase())) {
			sb.append("- Must not contain your username.\n");
		}
		boolean upper = false, lower = false, digit = false, special = false;
		String specialChars = "!@#$%^&*";
	    for (char c : pwd.toCharArray()) {
	        if (Character.isDigit(c)) digit = true;
	        else if (Character.isLowerCase(c)) lower = true;
	        else if (Character.isUpperCase(c)) upper = true;
	        else if (specialChars.indexOf(c) >= 0) special = true;
	    }
	    if (!upper) sb.append("- Add at least one uppercase letter.\n");
	    if (!lower) sb.append("- Add at least one lowercase letter.\n");
	    if (!digit) sb.append("- Add at least one digit.\n");
	    if (!special) sb.append("- Add at least one special character (!@#$%^&*).\n");
	    
	    return sb.toString();
	}
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName:");
		String userName = sc.nextLine();
		System.out.println("Enter Password:");
		String pwd = sc.nextLine();
		if(isValid(userName,pwd)) {
			System.out.println("Password is valid and secure.");
		}
		else {
			System.out.println(feedBack(userName, pwd));
		}
	}

	

}
