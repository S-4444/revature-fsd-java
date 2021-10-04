package com.bankapp.menu;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Scanner;
import com.bankapp.model.Account;
import customerImpl.AccountDaoImpl;

import com.bankapp.form.AccountRegistrationFrom;

import customerImpl.AccountDaoImpl;

public class CustomerMainMenu extends Menu {

	public CustomerMainMenu(String name) {
		super(name);
		addMenuitem("Creat A New Account ");
		addMenuitem("View Account ");
		addMenuitem(" Transaction  ");
		addMenuitem("Exit");
		displayMenuCaptureSelection();
	}

	@Override
	void handleaction() {
		switch (selection) {

		case 1:

//        	 CustomerMainMenu view = new CustomerMainMenu("View account Menu");

			AccountRegistrationFrom accountRegistrationForm = new AccountRegistrationFrom(
					"New Account registartion form");
			accountRegistrationForm.captureDataAndPerfromAction();
			displayMenuCaptureSelection();
			break;

		case 2:
			AccountDaoImpl adao = new AccountDaoImpl();
			try {
				ArrayList<Account> account = adao.showAccounts();
				account.forEach(System.out::println);
			} catch (SQLException e) {

				e.printStackTrace();
			}
			displayMenuCaptureSelection();
			break;

		case 3:
			TransactionMenu tMenu = new TransactionMenu("Transaction Menu");
			tMenu.getAccount();
			tMenu.displayMenuCaptureSelection();

		case 4:
			System.out.println("You have loged out Sucessfully");
			
			break;

		}
	}

}
