import java.util.Scanner;


public class bankProgram {
	
	public static int displayOptions(Scanner keyboard) { // Method to display options and get the user's choice
		System.out.print("Enter your choice: "); // Prompts user for input
		
		return keyboard.nextInt(); // Reads and returns the user choice
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount();
		Scanner keyboard = new Scanner(System.in);
		boolean active = true; // Boolean variable to control loop execution

		
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
			
			else if (menuChoice == 2) { // Deposit money option
				System.out.print("Enter amount to deposit: ");
				account.deposit(keyboard.nextDouble()); // uses deposit method with user input
				System.out.println("Deposit successful! New balance: $" + account.getBalance() + "\n");
			}
			
			else if (menuChoice == 3) { // Withdraw money option
				System.out.print("Enter amount to withdraw: ");
				account.withdraw(keyboard.nextDouble()); // Withdraws amount entered with widraw method
			}
			
			else if (menuChoice == 4) {  // Check balance option
				account.displayBalance(); // Calls method to display account balance
			}
			
			else if (menuChoice == 5) {  // Exit option
				System.out.print("Thank you for using Simple Bank System!");
				active = false;
			}
			
			else if (menuChoice < 1 || menuChoice > 5) { // basic error handling, input validation
				System.out.println("PLEASE ENTER A VALID NUMBER");
			}
			
			else {
				System.out.println("PLEASE ENTER A VALID NUMBER");
			}
			
		}
		
		
		
		
}


}
