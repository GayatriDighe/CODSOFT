package com.task3;
//TASK 3: ATM INTERFACE
//1. Create a class to represent the ATM machine.
//2. Design the user interface for the ATM, including options such as withdrawing, depositing, and checking the balance.
//3. Implement methods for each option, such as withdraw(amount), deposit(amount), and checkBalance().
//4. Create a class to represent the user's bank account, which stores the account balance.
//5. Connect the ATM class with the user's bank account class to access and modify the account balance.
//6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
//7. Display appropriate messages to the user based on their chosen options and the success or failure of their transactions.

import java.util.Scanner;

class BankAccount {
	private double balance;
	
	public double getbalance() {
		return balance;
	    }
	public BankAccount(double initialBalance) {
		this.balance=initialBalance;	
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println(" Succesfully Deposite:"+amount);
		}else {
			System.out.println("Deposite amount must be positive");	
			}
		}
	public boolean withdraw(double amount) {
		if(amount>0 && amount <=balance) {
			balance-=amount;
			System.out.println("Succesfully withdraw"+amount);
		return true;
		}else {
			System.out.println("Insuffient balance invalid amount");
			return false;
		}
	}
}
class ATM{
	
//	this is users bank account
	private BankAccount account; 

    
    public ATM(BankAccount bankAccount) {
        this.account = bankAccount;
    }

    public void checkBalance() {
    	account.getbalance();
        System.out.println("Your current balance is: " + account.getbalance());
    }

    
    public void deposit(double amount) {
        account.deposit(amount);
    }

   
    public void withdraw(double amount) {
        account.withdraw(amount);
    }

   
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);  
        int choice;

        while (true) {
            
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting ..ATM... Thank you for visit our service.");
//                    return;  
                default:
                    System.out.println("Invalid option.Please try again.");
            }
        }
    }
}

public class Atm_Interface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1500.0);
        
        ATM atm = new ATM(userAccount);
        atm.showMenu();
    }
}