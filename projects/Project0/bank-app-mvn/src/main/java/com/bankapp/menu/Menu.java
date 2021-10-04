package com.bankapp.menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public abstract class Menu {

	protected String name;
	protected List<String> menuItem;
	protected int selection;

	public Menu(String name) {
		this.name = name;
		menuItem = new ArrayList<String>();

	}

	public void addMenuitem(String menuItemName) {
		menuItem.add(menuItemName);
	}

	public void displayMenu() {
		System.out.println("=*=*=*=*=*=");
		System.out.println(name);
		System.out.println("=*=*=*=*=*=");
		for (int i = 0; i < menuItem.size(); i++) {
			System.out.println((i + 1) + ". " + menuItem.get(i));

		}
		System.out.println("Choose options keys  : ");
	}

	public void displayMenuCaptureSelection() {
		boolean validnumber = true;
		while (validnumber) {
			try {
				displayMenu();
				Scanner scanner = new Scanner(System.in);
		     	selection = scanner.nextInt();   
//				selection = Integer.parseInt(scanner.nextLine());
				if (selection > 0 && selection <= menuItem.size()) {
					validnumber = false;
				} else {
					System.out.println(" Please Enter a Valid Number Between 1 to " + menuItem.size() + ".....");
				}

			} catch (InputMismatchException e) {
				System.out.println("Please Enter a valid Number...");
			}
		}
		handleaction();
	}

	abstract void handleaction();

}
