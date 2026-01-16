package Day2;

import java.util.Scanner;

public class Q6_CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String res = sc.nextLine();
		if(checkPalindrome(res)) {
			System.out.println(res+" is palindrome");
		}
		else {
			System.out.println(res+" is not a palindrome");
		}
	}

	private static boolean checkPalindrome(String res) {
		StringBuilder reverseString = new StringBuilder(res).reverse();
		String check = reverseString.toString();
		return res.equalsIgnoreCase(check);
	} 

}
