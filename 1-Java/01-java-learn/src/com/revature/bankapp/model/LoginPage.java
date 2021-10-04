package com.revature.bankapp.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginPage {

	public void namePassword() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = sc.nextLine();

		System.out.println("Enter your password : ");
		try {
			int password = sc.nextInt();
			System.out.println("Your Loging is SuccessFull.... ");

		} catch (InputMismatchException e) {
			System.out.println("Please enter Numaric password ..... ");
		}

	}

}
