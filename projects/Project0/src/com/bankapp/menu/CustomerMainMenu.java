package com.bankapp.menu;

import java.util.Scanner;

import com.bankapp.transaction.Account;
import com.bankapp.transaction.Transaction;

public class CustomerMainMenu extends Menu {

	public CustomerMainMenu(String name) {
		super(name);
		addMenuitem("View Account ");
		addMenuitem("Creat A New Account ");

	}

	@Override
	void handleaction() {
          switch (selection) {
          
          
          case 1: 
        	 
          	Transaction transaction1 = new Transaction('W',2000);
    		Transaction transaction2 = new Transaction('D',20000);
    		Transaction transaction3 = new Transaction('D',500);
    		Transaction transaction4 = new Transaction('W',15000);
    		Transaction transaction5 = new Transaction('W',10000);
    	    
    	    Transaction[] transactionArray= {transaction1, transaction2,transaction3,transaction4,transaction5};
			Account account = new Account("990122447890" , 5000.0, transactionArray );
          	  account.printStatement();
          }
           
		  
	}

}
