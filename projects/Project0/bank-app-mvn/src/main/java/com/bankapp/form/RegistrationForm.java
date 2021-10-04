package com.bankapp.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.bankapp.menu.MainMenu;
import com.bankapp.model.Customer;
import com.bankapp.model.DataManeger;

import customerImpl.CustomerDaoImpl;

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

		CustomerDaoImpl customerdao = new CustomerDaoImpl();
		try {
			customerdao.creat(new Customer (firstname , lastname , email , password ));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Customer added Successfully ");
		
	}

	@Override
	public void action() {
		MainMenu menu = new MainMenu("Main List");
		menu.displayMenuCaptureSelection();
		
		
	}

}
