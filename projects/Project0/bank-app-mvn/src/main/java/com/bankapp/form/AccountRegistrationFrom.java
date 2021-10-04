package com.bankapp.form;

import static org.junit.jupiter.api.Assertions.fail;


import java.sql.SQLException;
import java.util.Scanner;

import com.bankapp.model.Account;

import customerImpl.AccountDaoImpl;
import customerImpl.CustomerDaoImpl;

public class AccountRegistrationFrom extends Form{
 
	
	double balance ;
	String branch;
	String  first_name;
	String last_name;
	String email;
	
	public AccountRegistrationFrom(String name) {
		super(name);
		
	}

	

	@Override
	public void captureData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the balance :");
	    balance = scanner.nextDouble();
		System.out.println("Enter branch name :");
	    branch = scanner.next();
		System.out.println("Enter your First Name : ");
		first_name= scanner.next();
		System.out.println("Enter your Last name : ");
		last_name = scanner.next();
		System.out.println("Enter email address :");
		email = scanner.next();
		System.out.println("Account Creat Sucessfully...");
		
	}

	@Override
	public void action() {
        
		AccountDaoImpl customerDaoImpl = new AccountDaoImpl();
	
	
		try {
			customerDaoImpl.create(new Account (balance , branch , first_name , last_name , email));
		} catch (SQLException e) {
			
			e.printStackTrace();
			fail("Getting employee list failed.");
		}
		success = true;

	}
}
