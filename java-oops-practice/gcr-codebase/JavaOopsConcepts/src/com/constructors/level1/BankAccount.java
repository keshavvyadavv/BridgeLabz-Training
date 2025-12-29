package com.constructors.level1;

//Parent class
public class BankAccount {
 public int accountNumber;
 protected String accountHolder;  
 private double balance;          

 // Constructor
 public BankAccount(int accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 //Public method to access balance
 public double getBalance() {
     return balance;
 }

 //Public method to modify balance
 public void setBalance(double balance) {
     if (balance >= 0) {
         this.balance = balance;
     }
 }
}
