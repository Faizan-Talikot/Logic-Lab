package core-java-practice.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers (Enter -999 to stop):");
        while(true) {
        	if(!sc.hasNextInt()) {
        		String invalid = sc.next();
                if (invalid.equals("-999")) break; // Handle case if read as string
                System.out.println("Skipping non-integer: " + invalid);
                continue;
        	}
        	int num = sc.nextInt();
            if (num == -999) break;
            list.add(num);
        }
        if(list.isEmpty()) {
        	System.out.println("No data to aggregate.");
            return;
        }
        Collections.sort(list);
        System.out.println("\n--- Statistics ---");
        System.out.println("Count: " + list.size());
        System.out.println("Min: " + list.get(0)); // First element after sort
        System.out.println("Max: " + list.get(list.size() - 1)); // Last element after sort
        System.out.printf("Average: %.2f\n", average(list));
        System.out.printf("Median: %.2f\n", median(list));
        System.out.println("Mode: " + mode(list));
	}

	private static int mode(ArrayList<Integer> list) {
		int mode = list.get(0);
		int maxCount = 0;
		int i = 0;
		while(i < list.size()) {
			int count = 0;
			int currentVal = list.get(i);
			while(i<list.size() && list.get(i) == currentVal) {
				count++;
				i++;
			}
			if(count>maxCount) {
				maxCount = count;
				mode = currentVal;
			}
		}
		return mode;
	}

	private static double median(ArrayList<Integer> list) {
		int n = list.size();
		if(n%2 != 0) {
			return list.get(n/2);
		}
		else {
			return (list.get(n/2 - 1) + list.get(n/2)) / 2.0;
		}
	}

	private static double average(ArrayList<Integer> list) {
		long sum = 0;
		for(int num: list) sum+=num;
		return (double) sum / list.size();
	}
	

}
