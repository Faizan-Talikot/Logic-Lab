package Day1;
import java.util.Scanner;

public class Q1_StringReverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userString = sc.nextLine();
		StringBuilder newString = new StringBuilder(userString);
		
		
		System.out.println("Your reversed String: "+newString.reverse());

	}

}
