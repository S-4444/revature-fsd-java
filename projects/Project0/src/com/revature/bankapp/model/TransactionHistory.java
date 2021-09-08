package com.revature.bankapp.model;

public class TransactionHistory {

	public char type;
	private double amount;

	public TransactionHistory(char type, double amount) {
//		super();
		this.type = type;
		this.amount = amount;
	}

	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public void printStatment(double balance) {

		System.out.printf("  %c %11.2f %8.2f \n", type, amount, balance);
	}

}
