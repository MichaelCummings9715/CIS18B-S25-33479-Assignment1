package school;

public class BankAccount {
	String accountHolderName;
	int accountNumber;
	double balance;
	
	public BankAccount() {
		accountHolderName = "";
		balance = 0.0;
		accountNumber = 0;
	}
	
	
	public void deposit(double depositAmount) {
		
		balance += depositAmount;
		
	}
	
	public double getBalance() {
		
		return balance;
		
	}
	
	public void withdraw(double withdrawlAmount) {
		
		if (withdrawlAmount > balance) {
			System.out.println("INSUFFICIENT FUNDS!\n");
		}
		else {
			balance -= withdrawlAmount;
		}
		
	}
	
	public void setName(String name) {
		
		accountHolderName = name; 
	}
	
	public void setBalance(double accountBalance) {
		
		balance = accountBalance;
	}
	
	public void displayBalance() {
		System.out.println("Current balance is: $" + getBalance() + "\n");
	}
	

	
}

	