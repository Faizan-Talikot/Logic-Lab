package Day4;

class BankAccount{
	private String owner;
	private double balance;
	
	//Constructor
	BankAccount(String owner,double initialBalance){
		this.owner = owner;
		if(initialBalance>0) this.balance = initialBalance;
		else {
			this.balance = 0;
		}
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		}
		else {
			System.out.println("Error: Deposit must be positive.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
		}
		else {
			System.out.println("Error: Insufficient funds or invalid amount.");
		}
	}
	protected void applyFee(double fee) {
		if (fee > 0 && balance >= fee) {
            balance -= fee;
            System.out.println("Fee applied: " + fee);
        }
	}
	public String getOwner() {
		return owner;
	}
	public double getBalance() {
		return balance;
	}
	
	
}

public class Q6_BankSimulation {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Faizan", 1000.0);
		acc.deposit(500);  // Balance becomes 1500
        acc.withdraw(300); // Balance becomes 1200
        
        System.out.println("Owner: " + acc.getOwner());
        System.out.println("Current Balance: " + acc.getBalance()); // Output: 1200.0

        // Attempting an invalid withdrawal
        acc.withdraw(2000); // Output: Error message

	}

}
