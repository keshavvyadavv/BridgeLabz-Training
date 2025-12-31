package com.inheritance.level1.bankaccounttypes;

public class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    //Constructor 
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}