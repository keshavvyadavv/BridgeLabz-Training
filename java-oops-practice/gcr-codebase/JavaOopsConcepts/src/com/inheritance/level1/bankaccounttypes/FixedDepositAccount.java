package com.inheritance.level1.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
    int maturityPeriod; 
    //Constructor 
    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

