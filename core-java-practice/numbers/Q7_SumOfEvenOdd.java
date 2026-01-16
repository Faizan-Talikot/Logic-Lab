package Day2;

import java.util.Scanner;

public class Q7_SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of number to read.");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" numbers each on new line.");
		int Evensum = 0,OddSum=0;
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			if(num%2==0) Evensum+=num;
			else OddSum += num;
		}
		System.out.println("Sum of even numbers is: "+Evensum+" and sum of odd numbers is: "+OddSum);
	}

} 	
