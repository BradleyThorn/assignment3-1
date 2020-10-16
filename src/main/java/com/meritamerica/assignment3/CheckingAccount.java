package com.meritamerica.assignment3;

import com.meritamerica.assignment3.BankAccount;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CheckingAccount extends BankAccount{

	public static double balance;
	public static double interestRate = 0.0001;
	
	public CheckingAccount(double openingBalance, double interestRate){
		super(openingBalance, interestRate);
	}
	
	public CheckingAccount(long accountNumber, double openingBalance, java.util.Date accountOpenedOn){
		super(accountNumber, openingBalance, accountOpenedOn);
		
	}
	
	public CheckingAccount(long accountNumber, double balance, double interestRate, java.util.Date accountOpenedOn) {
		super(accountNumber, balance, interestRate, accountOpenedOn);
	}
	
	
	static CheckingAccount readFromString(String accountData) throws ParseException
	{
		CheckingAccount chk;
		
		try {
			ArrayList<String> x = new ArrayList<>(Arrays.asList(accountData.split(",")));
			//List<String> x = Arrays.asList(accountData.split("\\s*,\\s*"));
			long acNum = Long.parseLong(x.get(0));
			double b = Double.parseDouble(x.get(1));
			double ir = Double.parseDouble(x.get(2));
			Date date = formatter.parse(x.get(3));
			chk = new CheckingAccount(acNum, b, ir, date);
		}
		catch(ParseException ex) {
			throw new java.lang.NumberFormatException();
		}
		return chk;
			
		
	}
	
}