package com.javakeywords.level1;

public class BankAccount {

	   // Common bank details
	   private static String bankName = "State bank of India";
	   private static int totalAccounts = 0;
	   // Account number cannot be modified
	   private final String accountNumber;
	   private String accountHolderName;
	   private double balance;
	   // Constructor to initialize account
	   public BankAccount(String accountHolderName, String accountNumber, double balance) {
	       this.accountHolderName = accountHolderName;
	       this.accountNumber = accountNumber;
	       this.balance = balance;
	       totalAccounts++;
	   }
	   // Displays total accounts created
	   public static void getTotalAccounts() {
	       System.out.println("Total number of accounts: " + totalAccounts);
	   }
	   // Prints account information
	   public void displayAccountDetails() {
	       if (this instanceof BankAccount) {
	           System.out.println("Bank Name: " + bankName);
	           System.out.println("Account Holder: " + accountHolderName);
	           System.out.println("Account Number: " + accountNumber);
	           System.out.println("Balance: $" + balance);
	       } else {
	           System.out.println("Invalid account.");
	       }
	   }
	   // Returns account holder name
	   public String getAccountHolderName() {
	       return accountHolderName;
	   }
	   // Updates account holder name
	   public void setAccountHolderName(String accountHolderName) {
	       this.accountHolderName = accountHolderName;
	   }
	   // Returns current balance
	   public double getBalance() {
	       return balance;
	   }
	   // Adds money to balance
	   public void deposit(double amount) {
	       if (amount > 0) {
	           balance += amount;
	           System.out.println("Deposited: $" + amount);
	       } else {
	           System.out.println("Invalid deposit amount.");
	       }
	   }
	   // Removes money from balance
	   public void withdraw(double amount) {
	       if (amount > 0 && amount <= balance) {
	           balance -= amount;
	           System.out.println("Withdrawn: $" + amount);
	       } else {
	           System.err.println("Insufficient balance or invalid amount.");
	       }
	   }
	   // Program execution starts here
	   public static void main(String[] args) {

	       BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
	       BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);
	       System.out.println("\nAccount 1 Details:");
	       account1.displayAccountDetails();
	       System.out.println("\nAccount 2 Details:");
	       account2.displayAccountDetails();
	       BankAccount.getTotalAccounts();

	       //print result
	       System.out.println("\nPerforming transactions on Account 1:");
	       account1.deposit(200);
	       account1.withdraw(150);
	       account1.displayAccountDetails();
	       account2.displayAccountDetails();
	       account2.deposit(100);
	       account2.withdraw(800);
	   }
	}

