package com.revature.bankapp.model;

import java.util.ArrayList;
import java.util.List;

public class DataManeger {
	
	public static List<Customer> customerList = new ArrayList<Customer>();
	
	static {
		customerList.add(new Customer("Sanjoy" , "Das" , "sdas@gmail.com" , "s1234"));
	}
	
	public static void addCustomer(Customer customer) {  /* we have created this method static because for access "data"
		                                                    we have to need a static method , because data is an Static 
		                                                    variable  */ 
		   customerList.add(customer);
	}
	
	public static Customer getCustomerByEmail(String email) {
		for (Customer customer:customerList) {
			if(customer.getEmail().equals(email)){; // we acn also use lamda fc. here and use map , filter and reduce fc. 
			return customer;
			}
		
		}
		return null;
	}

}
