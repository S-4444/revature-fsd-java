package com.revature.bankapp.model;

public class AccountClass {

	private String number;
	private char type;
	private double balance;

	public AccountClass(String number, char type, double balance) {
//		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public char getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

	public void displayDetails() {

		System.out.println("your account number is : " + number);
		System.out.println("your account type is :" + type);
		System.out.println("Your initial balance is : " + balance);

		System.out.println();
	}

}
