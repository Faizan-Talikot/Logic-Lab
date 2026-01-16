package Day1;
import java.util.Scanner;

public class Q3_PrimeOrNot {
	
	static boolean checkPrime(int num) {
		if(num<=1) return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
                return false;
		}
		return true;
            
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isprime = checkPrime(num);
		if(isprime) {
			System.out.println(num +" is prime");
		}
		else {
			System.out.println(num +" is not prime");
		}
		
	}

}
