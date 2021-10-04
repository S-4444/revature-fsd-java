package com.revature.bankapp.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.dao.EmployeeLoginDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Employee;
import com.revature.bankapp.model.Transaction;

public class EmployeeDaoImpl implements EmployeeLoginDao{

	@Override
	public List<Customer> viewCustomer() throws SQLException {
		List<Customer> customerList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from customer";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				
				Customer customer = new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setFirstname(resultSet.getString("FirstName"));
				customer.setLastname(resultSet.getString("LastName"));
				customer.setEmail(resultSet.getString("Email"));
				customer.setPassword(resultSet.getString("password"));
				customerList.add(customer);
			}
		return customerList;
		}
	}
	
	

	@Override
	public List<Account> viewAccount() throws SQLException {
		List<Account> accountList = new ArrayList<>();

		try (Connection connection = Util.getConnection()) {
			String sql = "select * from customer inner join "
					+ "account on customer.Email = account.email";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Account account = new Account();
//				account.setAccount_num(resultSet.getInt("account_num"));
				account.setBalance(resultSet.getDouble("balance"));
				account.setFirst_name(resultSet.getString("first_name"));
				account.setFirst_name(resultSet.getString("last_name"));
				account.setBranch(resultSet.getString("branch"));
				accountList.add(account);

			}
		}
		return accountList;
		
	}
	public Employee getEmployeeEmail(String email) throws SQLException {
		Employee employee = null;
		
		try (Connection connection = Util.getConnection()){
			String sql = "select * from employee where email = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1,email);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				
				String email1 = resultSet.getString("email");
				String password = resultSet.getString("password");
				
				employee = new Employee(email1, password);
			}
		}
		return employee;
	}



	@Override
	public List<Transaction> viewTransaction() throws SQLException {
		
		List<Transaction> transactionList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from transaction";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Transaction transactionTemp = new Transaction();
				transactionTemp.setType(resultSet.getString("type").charAt(0));
				transactionTemp.setAmount(resultSet.getDouble("amount"));
				transactionTemp.setAccountId(resultSet.getInt("account_id"));
				transactionList.add(transactionTemp);

			}
		}
		return transactionList;
	}
}
