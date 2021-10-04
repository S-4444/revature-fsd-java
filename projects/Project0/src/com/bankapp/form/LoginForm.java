package com.bankapp.form;

import java.util.Scanner;

import com.bankapp.menu.CustomerMainMenu;
import com.bankapp.model.Customer;
import com.bankapp.model.DataManeger;

public class LoginForm extends Form {
	
	public String email;
	public String password;

	public LoginForm(String name) {
		super(name);

	}

	@Override
	public void captureData() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Email Address : ");
		email = scanner.nextLine();

		System.out.println("Enter Your Password : ");
		password = scanner.nextLine();
		
	}

	@Override
	public void action() {
		Customer customer = DataManeger.getCustomerByEmail(email);   //
		if(customer ==null) {
			System.out.println("Invalid Email or Password");
		}
		
		else if(customer.getPassword().equals(password)){   
			success=true;
			System.out.println("Login Successfull");
			System.out.println("Welcome "+customer.getFirstname());
			CustomerMainMenu menu = new CustomerMainMenu("Customer Menu");
			menu.displayMenuCaptureSelection();
			
			
		}
		else {
			System.out.println("Invalid login or Password...");
		}
	}

}
