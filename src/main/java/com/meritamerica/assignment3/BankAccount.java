package com.meritamerica.assignment3;

import java.util.Date;

public class BankAccount {
	
	double balance;
	double interestRate;
	long accountNumber;
	Date accountOpenedOn;
	
	public BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	
	public BankAccount(double balance, double interestRate, java.util.Date accountOpenedOn)
	{
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
		
	}
	
	public BankAccount(long accountNumber, double balance, double interestRate, java.util.Date accountOpenedOn)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
	}
	
	java.util.Date getOpenedOn()
	{
		return accountOpenedOn;
	}
	
	long getAccountNumber(){
		return accountNumber;
	}
	
	
	double getBalance(){
		return balance;
	}
	
	
	double getInterestRate(){
		return interestRate;
	}
	
	
	public boolean withdraw(double amount) {
		if(amount < 0 || amount > balance) {
		return false;
		}
		else {
			balance -= amount;
		} return true;
	}
	
	boolean deposit(double amount) {
	if(amount < 0) {
		return false;	
		} 
		else { 
			balance += amount;
		} return true;
	}
	
	double futureValue(int years) {
		double futureValue = balance* Math.pow((1+ interestRate), years);
		return futureValue;
	} 
	
	
	

}
