package com.revature.bankapp.model;

import java.util.Scanner;

public class Home {
	private double balance;
	private TransactionHistory[] transaction;

	public Home(double balance, TransactionHistory[] transaction) {
//		super();
		this.balance = balance;
		this.transaction = transaction;
	}

	public void printStatement() {

		System.out.println("\n-------------------------");
		System.out.println("Type Transaction Balance ");
		System.out.println("-------------------------");

		for (TransactionHistory transaction : transaction) {
			if (transaction.getType() == 'D') {
				balance += transaction.getAmount();
			}
			if (transaction.getType() == 'W') {
				balance -= transaction.getAmount();
			}
			transaction.printStatment(balance);
		}
	}

	public static void main(String[] args) {

		int option = 0;

		while (true) {
			System.out.println("/nMenu");
			System.out.println("===================");
			System.out.println("1. Login your account");
			System.out.println("2. Check account details");
			System.out.println("3. Check Tranjaction History");
			System.out.println("4. Exit");

			Scanner sc = new Scanner(System.in);

			System.out.println("Choose an Option");
			option = sc.nextInt();

			switch (option) {
			case 1:
				LoginPage loging = new LoginPage();
				loging.namePassword();

				break;
			case 2:
				System.out.println("Please Enter Passcode : ");
				int passcode = sc.nextInt();
				System.out.println("Passcode verified pleas wait......");
				AccountClass account = new AccountClass("01123456", 'S', 5000);
				account.displayDetails();
				break;
			case 3:
				TransactionHistory transaction1 = new TransactionHistory('W', 2000);
				TransactionHistory transaction2 = new TransactionHistory('D', 20000);
				TransactionHistory transaction3 = new TransactionHistory('D', 500);
				TransactionHistory transaction4 = new TransactionHistory('W', 15000);
				TransactionHistory transaction5 = new TransactionHistory('W', 10000);

				TransactionHistory[] transactionArray = { transaction1, transaction2, transaction3, transaction4,
						transaction5 };

				Home home = new Home(5000, transactionArray);
				home.printStatement();

				break;
			case 4:
				System.out.println("4. Exit ");
				System.exit(option);
			}
		}

	}

}
