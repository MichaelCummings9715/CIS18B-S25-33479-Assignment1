import java.util.Scanner;


public class bankProgram {
	
	public static int displayOptions(Scanner keyboard) {
		System.out.print("Enter your choice: ");
		
		return keyboard.nextInt();
	}
	
	public void menuChoice(int menuChoice) {
		
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount();
		Scanner keyboard = new Scanner(System.in);
		boolean active = true;
		
		// display menu options
		System.out.println("\nWelcome to Simple Bank System");
		System.out.println("1. Create Account");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Check Balance");
		System.out.println("5. Exit \n");
		
		while(active) {
			
			int menuChoice = displayOptions(keyboard);
			
			//determine user selection
			
			if (menuChoice == 1) {
				// Prompt account holder name
				System.out.print("Enter account holder name: ");
				keyboard.nextLine();
				account.setName(keyboard.nextLine());
				
				// Prompt initial deposit
				System.out.print("Enter initial deposit: ");
				account.deposit(keyboard.nextDouble());
				
				//success message
				System.out.println("\nAccount created successfully! \n");
				System.out.println("2. Deposit Money");
				System.out.println("3. Withdraw Money");
				System.out.println("4. Check Balance");
				System.out.println("5. Exit \n");
			
			}
			
			else if (menuChoice == 2) {
				System.out.print("Enter amount to deposit: ");
				account.deposit(keyboard.nextDouble());
				System.out.println("Deposit successful! New balance: $" + account.getBalance() + "\n");
			}
			
			else if (menuChoice == 3) {
				System.out.print("Enter amount to withdraw: ");
				account.withdraw(keyboard.nextDouble());
			}
			
			else if (menuChoice == 4) {
				account.displayBalance();
			}
			
			else if (menuChoice == 5) {
				System.out.print("Thank you for using Simple Bank System!");
				active = false;
			}
			
			else if (menuChoice < 1 || menuChoice > 5) {
				System.out.println("PLEASE ENTER A VALID NUMBER");
			}
			
			else {
				System.out.println("PLEASE ENTER A VALID NUMBER");
			}
			
		}
		
		
		
		
}


}
