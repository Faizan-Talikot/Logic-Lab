public class ATMSimulation

import java.util.Scanner;

public class Q10_ATMSimulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("New Balance: " + balance);
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("New Balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
       
    }
}