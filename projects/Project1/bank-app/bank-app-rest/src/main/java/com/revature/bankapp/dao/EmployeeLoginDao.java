package com.revature.bankapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Transaction;

public interface EmployeeLoginDao {


		List<Customer> viewCustomer() throws SQLException;

		List<Account> viewAccount() throws SQLException;

	    List<Transaction> viewTransaction() throws SQLException;
	

}
