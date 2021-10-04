package com.bankapp.form;

import java.util.Scanner;

import com.bankapp.menu.MainMenu;
import com.bankapp.model.Customer;
import com.bankapp.model.DataManeger;

public class RegistrationForm extends Form {
	
	
	Scanner scanner= new Scanner(System.in);

	public RegistrationForm(String name) {
		super(name);
		
	}

	@Override
	public void captureData() {
		

		System.out.println("Enter Your First Name : ");
		String firstname = scanner.nextLine();

		System.out.println("Enter Your last Name : ");
		String lastname = scanner.nextLine();

		System.out.println("Enter Your Email Address : ");
		String email = scanner.nextLine();

		System.out.println("Enter Your Password : ");
		String password = scanner.nextLine();

		DataManeger.addCustomer(new Customer(firstname, lastname, email, password));
		System.out.println(" Customer added Successfully ");
		
	}

	@Override
	public void action() {
		MainMenu menu = new MainMenu("Main List");
		menu.displayMenuCaptureSelection();
		
		
	}

}
