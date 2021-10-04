package com.bankapp.menu;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bankapp.form.AccountRegistrationFrom;
import com.bankapp.form.LoginForm;
import com.bankapp.form.RegistrationForm;
import com.bankapp.model.Account;
import com.bankapp.model.Customer;
import com.bankapp.model.Transaction;
import com.bankapp.unit.EmployeeLoginDao;

import customerImpl.EmployeeDaoImpl;

public class EmployeeMenu extends Menu {

	public EmployeeMenu(String name) {
		super(name);
		addMenuitem("Register for Customer account");
		addMenuitem("Display All Customers");
		addMenuitem("Display All Accounts");
		addMenuitem("Display Transactions");
		
		addMenuitem("Logout");
		
	}

	@Override
	void handleaction() {
		EmployeeLoginDao edao = new EmployeeDaoImpl();
		switch(selection) {
		case 1:
			RegistrationForm signUp = new RegistrationForm("Customer SignUp");
			signUp.captureDataAndPerfromAction();
			
			LoginForm loginForm = new LoginForm("Customer Login");
			loginForm.captureDataAndPerfromAction();
			
			AccountRegistrationFrom createAcc = new AccountRegistrationFrom("Account details");
			createAcc.captureDataAndPerfromAction();
			
			displayMenuCaptureSelection();
			
			break;
		case 2:
			try {
				ArrayList<Customer> acc = (ArrayList<Customer>) edao.viewCustomer();
				acc.forEach(System.out::println);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			displayMenuCaptureSelection();
			break;
		case 3:
			try {
				ArrayList<Account> acc = (ArrayList<Account>) edao.viewAccount();
				acc.forEach(System.out::println);
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			displayMenuCaptureSelection();
			break;
		case 4:
			try {
				ArrayList<Transaction> trans = (ArrayList<Transaction>) edao.viewTransaction();
				trans.forEach(System.out::println);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayMenuCaptureSelection();
			break;
		
		case 5:
			MainMenu mainmenu = new MainMenu("Main Menu");
//			mainmenu.displayMenu();
			System.out.println(" You Have Logged Out Sucessfully ");
			break;
		
	}

}
}
