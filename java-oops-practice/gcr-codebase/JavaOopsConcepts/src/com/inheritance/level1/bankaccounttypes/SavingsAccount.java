package com.inheritance.level1.bankaccounttypes;

public class SavingsAccount extends BankAccount {
    double interestRate;
    // Constructor 
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    //Method to display account type
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
