package com.bankapp.unit;

import java.sql.SQLException;
import java.util.List;

import com.bankapp.model.Account;
import com.bankapp.model.Customer;
import com.bankapp.model.Transaction;

public interface EmployeeLoginDao {


		List<Customer> viewCustomer() throws SQLException;

		List<Account> viewAccount() throws SQLException;

	    List<Transaction> viewTransaction() throws SQLException;
	

}
