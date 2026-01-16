package Day2;

import java.util.Scanner;

public class Q2_GradeCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects.");
		int sum = 0;
		for(int i=0;i<5;i++) {
			int mark = sc.nextInt();
			sum += mark;
		}
		double percentage = (sum / 500.0) * 100;
		System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + sum + "/500");
        System.out.println("Percentage: " + percentage + "%");
        if(percentage>=90) System.out.println("Grade: A");
        else if(percentage>=75) System.out.println("Grade: B");
        else if(percentage>=60) System.out.println("Grade: C");
        else if(percentage>=40) System.out.println("Grade: D");
        else System.out.println("Grade: F");
	}
}
