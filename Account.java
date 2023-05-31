package edu.project.ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner scan = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	/* Set customer number */
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	/* Set pin number */
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	/* Get pin number */
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	/* Get the customer number */
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	/* Get checking account  number */
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	/* Get saving account  number */
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	/* Calculate checking account  withdraw */
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = ( checkingBalance - amount );
		return checkingBalance;
	}
	
	/* Calculate checking account  deposit */
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = ( checkingBalance + amount );
		return checkingBalance;
	}
	
	/* Calculate saving account  withdraw */
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = ( savingBalance - amount );
		return savingBalance;
	}
	
	/* Calculate saving account  deposit */
	
	public double calcsavingDeposit(double amount) {
		savingBalance = ( savingBalance + amount );
		return savingBalance;
	}
		
	/* Customer checking account withdraw input */
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from checking account: ");
		double amount = scan.nextDouble();
		
		if (( checkingBalance - amount ) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Your Balance is Low...!!");
		}
	}
	
	
	/* Customer Saving account withdraw input */
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from saving account: ");
		double amount = scan.nextDouble();
		
		if (( savingBalance - amount ) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Your Balance is Low...!!");
		}
	}
	
	/* Customer Checking account deposit input */
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to deposit from checking account: ");
		double amount = scan.nextDouble();
		
		if (( checkingBalance + amount ) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Your Balance is Low...!!");
		}
	}
	
	/* Customer Saving account deposit input */
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to deposit from saving account: ");
		double amount = scan.nextDouble();
		
		if (( savingBalance + amount ) >= 0) {
			calcsavingDeposit(amount);
			System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Your Balance is Low...!!");
		}
	}
	
	/*  */
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
}
