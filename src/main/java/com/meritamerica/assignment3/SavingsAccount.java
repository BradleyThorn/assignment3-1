package com.meritamerica.assignment3;

import com.meritamerica.assignment3.BankAccount;

public class SavingsAccount extends BankAccount {

	public double balance;
	public final double interestRate = 0.01;
	
//constructor method//
	public SavingsAccount(double openingBalance, double interestRate){
		super(openingBalance, interestRate);
	}
	
	public SavingsAccount(long accountNumber, double openingBalance, java.util.Date accountOpenedOn){
		super(accountNumber, openingBalance, accountOpenedOn);
		
	}
	
	public SavingsAccount(long accountNumber, double balance, double interestRate, java.util.Date accountOpenedOn) {
		super(accountNumber, balance, interestRate, accountOpenedOn);
	}
	
	

}
