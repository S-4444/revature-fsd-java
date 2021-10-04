package com.bankapp.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.bankapp.menu.EmployeeMenu;
import com.bankapp.model.Employee;

import customerImpl.EmployeeDaoImpl;

public class EmployeeLogin extends Form {

	private String email;
	private String password;
	
	public EmployeeLogin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void captureData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Employee email");
		email = scanner.nextLine();
		System.out.println("Enter Password");
		password = scanner.nextLine();
		
	}

	@Override
	public void action() {
		EmployeeDaoImpl edao = new EmployeeDaoImpl();
		try {
			Employee employee = edao.getEmployeeEmail(email);
			if (employee == null) {
				System.out.println("Invalid User or Password");
			} else if (employee.getPassword().equals(password)) {
				success = true;
				System.out.println("Login Sucessfully\n");
				System.out.println("Welcome as admin" + employee.getEmail());
				EmployeeMenu empMenu = new EmployeeMenu("Employee Menu is Displaying now");
				//empMenu.displayMenu();
				empMenu.displayMenuCaptureSelection();

			}

		} catch (SQLException e) {
			System.out.println("ERROR");

		
	}

	
}
}
