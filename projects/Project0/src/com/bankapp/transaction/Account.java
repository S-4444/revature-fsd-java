package com.bankapp.transaction;

public class Account {
     private String accountNumber;
     private double balance;
     private Transaction[] transactions;
	
     
     public Account(String accountNumber, double balance, Transaction[] transactions) {
//		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactions = transactions;
	}
     public void printStatement() {
    	  System.out.println("Account Statement of : "+ accountNumber);
          System.out.println("Initial Balance : "+ balance);
          
          System.out.println("\n-------------------------");
          System.out.println("Type Transaction Balance ");
          System.out.println("-------------------------");
    
           for (Transaction transaction : transactions) {
        		if (transaction.getType()=='D') {
        			balance+=transaction.getAmount();
        		}
        		if(transaction.getType()=='W' && balance > transaction.getAmount() ) {
        			balance-=transaction.getAmount();
        		}
        	   transaction.displayTransaction(balance);
           }
     }


     
}
