package edu.project.ATM;

import java.io.IOException;
import java.util.Map.Entry;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	/* Valid login information customer number and pin number */
	
	public void getLogin() throws IOException{
		boolean condition = true;
		do {
			try {
				data.put(12345678, 1234);
				data.put(87654321, 4321);
				System.out.println("Welcome to ATM Project :)\n");
				System.out.print("Enter Your Customer Number: ");
				setCustomerNumber(input.nextInt());
				System.out.print("\nEnter Your Pin Number: ");
				setPinNumber(input.nextInt());
				for (Entry<Integer, Integer> entry: data.entrySet()) {
					if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
						getAccountType();
						break;
					}
				}
				
				if (condition) {
					System.out.println("\nWrong Customer Number or Pin Number\n");
				}
			} catch (Exception e) {
				System.out.println("\n" + "Invalid Character(s), Only Numbers" + "\n");
				condition = false;
			}
			
		} while (condition == true);
	}
	
	/* Display Account Type Menu With Selection */
	
	public void getAccountType() {
		System.out.println("\nSelect the Account your want to access: ");
		System.out.println("Type - 1 - Checking Account");
		System.out.println("Type - 2 - Savings Account");
		System.out.println("Type - 3 - Exit");
		System.out.print("Choice: ");
		
		selection = input.nextInt();
		switch (selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank You for Using ATM.");
			System.exit(0);
			break;
		default:
			System.out.println("\nInvalid Choice.\n");
			getAccountType();
		}
	}
	
	/* Display Checking Account Number Menu with Selection */
	
	public void getChecking() {
		System.out.println("\nChecking Account: ");
		System.out.println("Type - 1 - View Balance");
		System.out.println("Type - 2 - Withdraw Funds");
		System.out.println("Type - 3 - Deposit Funds");
		System.out.println("Type - 4 - Back");
		System.out.println("Type - 5 - Exit");
		System.out.print("Choice: ");
		
		selection = input.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
			getChecking();
			break;
		case 2:
			getCheckingWithdrawInput();
			getChecking();
			break;
		case 3:
			getCheckingDepositInput();
			getChecking();
			break;
		case 4:
			getAccountType();
			break;
		case 5:
			System.out.println("Thank You for Using ATM.");
			System.exit(0);
			break;
		default:
			System.out.println("\nInvalid Choice.\n");
			getChecking();
		}
		
	}
	
	/* Display Savings Account Number Menu with Selection */
	
	public void getSaving() {
		System.out.println("\nSaving Account: ");
		System.out.println("Type - 1 - View Balance");
		System.out.println("Type - 2 - Withdraw Funds");
		System.out.println("Type - 3 - Deposit Funds");
		System.out.println("Type - 4 - Back");
		System.out.println("Type - 5 - Exit");
		System.out.print("Choice: ");
		
		selection = input.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance: "+ moneyFormat.format(getSavingBalance()));
			getSaving();
			break;
		case 2:
			getSavingWithdrawInput();
			getSaving();
			break;
		case 3:
			getSavingDepositInput();
			getSaving();
			break;
		case 4:
			getAccountType();
			break;
		case 5:
			System.out.println("Thank You for Using ATM.");
			System.exit(0);
			break;
		default:
			System.out.println("\nInvalid Choice.\n");
			getSaving();
		}
	}
	int selection; 
}
