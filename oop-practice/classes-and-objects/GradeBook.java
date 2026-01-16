package core.java.practice.oop.classes.and.objects;

import java.util.Scanner;

public class GradeBook {
	
	private static void printAll(int[] marks,String[] names) {
		System.out.print("All: ");
		for(int i=0;i<marks.length;i++) {
			System.out.print(names[i]+"("+marks[i]+")"+ ", ");
		}
	}
	
	private static void printTopper(int[] marks,String[] names) {
		int topper = 0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]> marks[topper]) topper = i;
		}
		System.out.println("Topper: "+names[topper]+"("+marks[topper]+")");
	}
	
	private static void classAvg(int[] marks, int n) {
		int avg = 0;
		for(int i=0;i<marks.length;i++) {
			avg += marks[i];
		}
		System.out.printf("Average: %.2f\n", (double)avg/n);
	}
	
	private static void SearchName(String[] names,int[] marks,String findName) {
		boolean found = false;
		for(int i=0;i<names.length;i++) {
			if(names[i].equalsIgnoreCase(findName)) {
				found = true;
				System.out.println("Found: "+ names[i] + "(" + marks[i] + ")");
			}
		}
		if(found == false) System.out.println("No Match Found");
	}
	
	private static void CurveGrades(int[] marks,String[] names) {
		for(int i=0;i<marks.length;i++) {
			marks[i] = Math.min(100, marks[i] + 5);
		}
		System.out.println("Updated marks:");
		for(int i=0;i<marks.length;i++) {
			System.out.println(names[i] + "(" + marks[i] + ")");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		int[] marks = new int[n];
		String[] names = new String[n];
		System.out.println("Enter details: ");
		for(int i = 0; i < n; i++) {
		    System.out.print("Enter name for student " + (i+1) + ": ");
		    names[i] = sc.next(); // or sc.nextLine() after clearing buffer
		    System.out.print("Enter grade: ");
		    marks[i] = sc.nextInt();
		}
		
		while(true) {
			System.out.println("\n--- Grade MENU ---");
            System.out.println("1. Print All");
            System.out.println("2. Print topper");
            System.out.println("3. Class average");
            System.out.println("4. Search by name (case-insensitive)");
            System.out.println("5. Curve grades by +5");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                printAll(marks, names);
                break;

            case 2:
                printTopper(marks, names);
                break;

            case 3:
                classAvg(marks, n);
                break;

            case 4:
            	System.out.println("Enter name to find:");
            	String name = sc.next();
                SearchName(names, marks, name);
                break;
               
            case 5:
            	CurveGrades(marks, names);
            	break;
            	
            case 6:
            	System.exit(0);

            default:
                continue;
          }
		}
		
	}

}
