package com.mybank;

public abstract class Account implements ITransaction {

    protected String accountNumber;   
    private double balance;           

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }


    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }


    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double checkBalance() {
        return balance;
    }


    public abstract double calculateInterest();
}
