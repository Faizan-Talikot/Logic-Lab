package Day3;

import java.util.Scanner;

public class Q4_ATMSimulator {

    private static double balance = 0.0;
    private static int pin = 1234;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1) Deposit\n2) Withdraw\n3) Check Balance\n4) Change PIN\n5) Exit");
            System.out.print("Enter option: ");
            
            int choice = sc.hasNextInt() ? sc.nextInt() : 0;
            if (choice == 0) {
                sc.next(); 
                continue;
            }

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    printBalance();
                    break;
                case 4:
                    changePin();
                    break;
                case 5:
                    System.out.println("Thank you for using our ATM!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
                    continue;
            }
        }
    }

    //Helper method to deposit
    private static void deposit() {
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited. Balance: %.2f\n", balance);
        } else {
            System.out.println("Error: Deposit must be positive.");
        }
    }

    //Helper method to withdraw
    private static void withdraw() {
        if (verifyPin()) {
            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.printf("Withdrawn. Balance: %.2f\n", balance);
            } else if (amount > balance) {
                System.out.println("Error: Insufficient funds.");
            } else {
                System.out.println("Error: Amount must be positive.");
            }
        }
    }

    private static void printBalance() {
        System.out.printf("Current Balance: %.2f\n", balance);
    }

    //Changing the pin
    private static void changePin() {
        if (verifyPin()) {
            System.out.print("Enter new PIN: ");
            int newPin = sc.nextInt();
            pin = newPin;
            System.out.println("PIN successfully changed.");
        }
    }

    //Helper method to check PIN
    private static boolean verifyPin() {
        System.out.print("Enter PIN: ");
        int input = sc.nextInt();
        if (input == pin) {
            return true;
        } else {
            System.out.println("Error: Incorrect PIN.");
            return false;
        }
    }
}