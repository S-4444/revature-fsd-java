package com.revature.bankapp.dao.impl;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mysql.cj.protocol.Resultset;
import com.revature.bankapp.dao.AccountDao;
import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao  {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDaoImpl.class);

	@Override
	public void creat(Customer customer) throws AppException {
       LOGGER.info("Start");
       LOGGER.debug("{}",customer);
		try (Connection connection = Util.getConnection()) {
			String sql = "INSERT INTO customer ( FirstName , LastName, Email, password) VALUES (? ,?, ? ,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, customer.getFirstname());
			statement.setString(2, customer.getLastname());
			statement.setString(3, customer.getEmail());
			statement.setString(4, customer.getPassword());
			statement.executeUpdate();
			LOGGER.info("End");
		}catch(SQLException e) {
			LOGGER.error("error inserting the customer");
			throw new AppException(e);
		}

	}

	@Override
	public Customer getByEmail(String email) throws SQLException {
		try (Connection connection = Util.getConnection()) {

			String sql = "SELECT * FROM customer where email= ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Customer customer = new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setFirstname(resultSet.getString("FirstName"));
				customer.setLastname(resultSet.getString("LastName"));
				customer.setEmail(resultSet.getString("Email"));
				customer.setPassword(resultSet.getString("password"));
				
            return customer;
			}
		}
		return null;
	}





}
