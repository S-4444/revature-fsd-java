package com.bankapp.transaction;

public class Transaction {
       
	public  char type;
	private double amount;
	
	
	public Transaction(char type , double amount) {
		this.type=type;
		this.amount = amount;
	}
	
	/*instance method becacuse no static and its not possible to call the method using 
	  Transaction.displayTransaction for call the method displayTransaction we have to 
	  creat the object of the Transaction class */
	
	public void displayTransaction(double balance) {
		System.out.printf("  %c %11.2f %8.2f\n" , type , amount, balance);
	   
	}
	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

}	
	 
 