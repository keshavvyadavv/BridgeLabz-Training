package com.objectmodeling.level1;

import java.util.ArrayList;
import java.util.List;
//create a Bank class 
public class Bank {
	//many customer can have in bank class
	private List<Customer> customerName;
	private String nameBank;
	Bank(String nameBank ){
		customerName = new ArrayList<>();
		this.nameBank= nameBank;
	}
	//create method that help in opening the account
	public void openAccount(Customer customer) {
		customerName.add(customer);
	}
}
