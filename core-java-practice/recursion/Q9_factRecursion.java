package Day2;

import java.util.Scanner;

public class Q9_factRecursion {
	
	static int fact(int n) {
		if(n==0) return 1;
		return n * fact(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial");
		int n = sc.nextInt();
		int ans = fact(n);
		System.out.println(ans);
	}

}
