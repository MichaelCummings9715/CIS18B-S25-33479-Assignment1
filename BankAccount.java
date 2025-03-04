public class BankAccount {
	String accountHolderName; // attributes
	int accountNumber;
	double balance;
	
	public BankAccount() { // constructor
		accountHolderName = "";
		balance = 0.0;
		accountNumber = 0;
	}
	
	
	public void deposit(double depositAmount) { // Method to deposit money into the account
		
		balance += depositAmount; // Adds the deposited amount to the current balance
		
	}
	
	public double getBalance() { // get method for balance
		
		return balance; // Returns the current balance
		
	}
	
	public void withdraw(double withdrawlAmount) { // Method to withdraw money from the account
		
		if (withdrawlAmount > balance) { // error handle for insufficient withdraw
			System.out.println("INSUFFICIENT FUNDS!\n");  
		}
		else {
			balance -= withdrawlAmount; // subtracts the amount from the balance
		}
		
	}
	
	// setters
	public void setName(String name) {
		
		accountHolderName = name;  // Assigns prompted name to the account holder
	}
	
	public void setBalance(double accountBalance) {
		
		balance = accountBalance;
	}
	
	public void displayBalance() { // Method to display the current balance
		System.out.println("Current balance is: $" + getBalance() + "\n"); // output user balance
	}
	

	
}

 	
	
