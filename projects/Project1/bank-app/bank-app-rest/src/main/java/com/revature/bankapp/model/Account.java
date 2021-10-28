package com.revature.bankapp.model;

import java.sql.SQLException;

import com.revature.bankapp.dao.impl.AccountDaoImpl;

public class Account {

	
	
	private double balance;
	private String branch;
	private String first_name;
	private String last_name;
    private int account_no ; 
	private String email;
	

	private boolean success = true;
	AccountDaoImpl accdao = new AccountDaoImpl();



	public Account(double balance, String branch, String first_name, String last_name, String email) {
		super();
		this.balance = balance;
		this.branch = branch;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}



	public Account(double balance, int account_no) {
		super();
		this.balance = balance;
		this.account_no = account_no;
	}



	public Account()
	{
		
	}
	
	

	public int getAccount_no() {
		return account_no;
	}



	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double d) {
		this.balance = d;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	@Override
	public String toString() {
		return "Account [balance=" + balance + ", branch=" + branch + ", first_name=" + first_name + ", last_name="
				+ last_name + ", account_no=" + account_no + "]";
	}
	
	public double withdraw(double withdrawAmount) {
		while (success) {
//			System.out.println("Enter amount: ");
//			double withdrawAmount = sc.nextDouble();
			if (withdrawAmount < 0) {
				System.out.println("Enter Amount greater than 0");
			} else if (withdrawAmount <= balance) {
				balance -= withdrawAmount;
				success = false;
				try {
					accdao.insert(new Transaction('D', withdrawAmount));
					accdao.update(this);
					System.out.println("Successfull");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Insufficient funds");
			}

		}
		return balance;
	}
	
	public double deposit(double depositAmount) {
		while (success) {
			if (depositAmount < 0) {
				System.out.println("Enter Amount greater than 0");
			} else {
				balance += depositAmount;
				success = false;
				try {
					accdao.insert(new Transaction('C', depositAmount));
					accdao.update(this);
					System.out.println("Successfull");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return balance;
	}
	
	
	public void transfer(double amount) {
		balance += amount;
		try {
			accdao.insertTransfer(new Transaction('C', amount));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			accdao.updateTransfer(this);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}




//	public long getAccount_num() {
//		return account_num;
//	}
//
//	public void setAccount_num(long account_num) {
//		this.account_num = account_num;
//	}

	
	
}
