package com.constructors.level1;

//Subclass
public class SavingsAccount extends BankAccount {

 // Constructor
 public SavingsAccount(int accountNumber, String accountHolder, double balance) {
     super(accountNumber, accountHolder, balance);
 }

 // Method to demonstrate access
 public void displayDetails() {
     System.out.println("Account Number: " + accountNumber);  
     System.out.println("Account Holder: " + accountHolder);   
     System.out.println("Balance: " + getBalance());            
 }
}
