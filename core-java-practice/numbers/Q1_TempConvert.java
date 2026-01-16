package Day2;

import java.util.Scanner;

public class Q1_TempConvert {

	public static void main(String[] args) {
		System.out.println("Select the conversion you want:");
		System.out.println("Type 1: CtoF");
		System.out.println("Type 2: FtoC");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.println(c + "°C is " + f + "°F");
        } 
        else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println(f + "°F is " + c + "°C");
        } 
        else {
            System.out.println("Invalid choice.");
        }

	}

}
