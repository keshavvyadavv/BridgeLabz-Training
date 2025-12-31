package com.inheritance.level1.bankaccounttypes;

public  class BankingSystem {
    public static void main(String[] args) {
        // Create objects of different account types
        SavingsAccount sa = new SavingsAccount("SA101", 5000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA202", 3000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount("FD303", 20000, 24);

        //display Savings Account details
        sa.displayAccountType();
        sa.displayDetails();
        System.out.println( );

        // D splay Checking Account details
        ca.displayAccountType();
        ca.displayDetails();
        
        System.out.println();

        // D splay Fixed Deposit Account details
        fda.displayAccountType();
        fda.displayDetails();
    }
}