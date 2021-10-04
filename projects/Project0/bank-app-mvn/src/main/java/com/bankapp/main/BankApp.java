package com.bankapp.main;

import com.bankapp.menu.MainMenu;
import com.bankapp.model.Customer;

public class BankApp {
	
	private static Customer currentCustomer=null;
	
	

	public static Customer getCurrentCustomer() {
		return currentCustomer;
	}



	public static void setCurrentCustomer(Customer currentCustomer) {
		BankApp.currentCustomer = currentCustomer;
	}



	public static void main(String[] args) {
		MainMenu menu = new MainMenu("Main List");
	    menu.displayMenuCaptureSelection();
		
	    
     }

}
