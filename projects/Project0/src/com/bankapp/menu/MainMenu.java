package com.bankapp.menu;

import java.util.Scanner;

import com.bankapp.form.LoginForm;
import com.bankapp.form.RegistrationForm;
import com.bankapp.model.Customer;
import com.bankapp.model.DataManeger;

public class MainMenu extends Menu {

	public MainMenu(String name) {
		super(name);
		addMenuitem("Resister now ");
		addMenuitem("Login as a Customer");
		addMenuitem("Login as a Employe");
		addMenuitem("Exit");

	}

	@Override
	void handleaction() {

		System.out.println("Selected Option Is : " + selection);
		Scanner scanner = new Scanner(System.in);
		switch (selection) {
		case 1:

			RegistrationForm form = new RegistrationForm(" Registration Form");
			form.captureDataAndPerfromAction();
			break;

		case 2:
//			System.out.println("=*=*=*=*=*=");
//			System.out.println("Login Form/n ");
//			System.out.println("=*=*=*=*=*=");

			LoginForm login = new LoginForm("Login Form");
			login.captureDataAndPerfromAction();
            break;
		}
	}

}
