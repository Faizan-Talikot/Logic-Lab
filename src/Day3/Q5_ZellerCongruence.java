package Day3;

import java.util.Scanner;

public class Q5_ZellerCongruence {
	
	public static String dayOfWeek(int d, int m, int y) {
		if (m < 3) {
            m += 12;
            y--;
        }
		
		int q = d;               // Day of the month
        int k = y % 100;         // Year of the century (last two digits)
        int j = y / 100;         // Zero-based century (first two digits)

        // Step 3: Apply Zeller's Congruence formula
        int h = (q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[h];
	}
	
	private static boolean isValidDate(int d, int m, int y) {
		if(y<0 || m>12 || m<1 || d<1) return false;
		int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		boolean isLeap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
        if (isLeap) daysInMonth[2] = 29;

        return d <= daysInMonth[m];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter date (dd mm yyyy):");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        
        if (isValidDate(d, m, y)) {
            String result = dayOfWeek(d, m, y);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Invalid date provided.");
        }
        
        

	}

}
