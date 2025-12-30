package com.objectmodeling.level1;

import java.util.ArrayList;
import java.util.List;
//create customer class
public class Customer {
	private List<Bank> bankName;
	private int balance;
	public Customer(int balance) {
		bankName = new ArrayList<>();
		this.balance = balance;
	}
	public void viewBalance(){
		System.out.println(this.balance);
	}
	
	public static void main(String[] args) {
		
		//create an object bank call sbi and customer object class raman
		Bank sbi = new Bank("SBI");
		Customer raman = new Customer(300);
		sbi.openAccount(raman);
		raman.viewBalance();
	}
}
