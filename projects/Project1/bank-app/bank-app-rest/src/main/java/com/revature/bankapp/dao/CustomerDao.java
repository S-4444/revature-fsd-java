package com.revature.bankapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Customer;


public interface CustomerDao {

	     void creat (Customer customer) throws AppException;
	    
	     Customer getByEmail(String email) throws SQLException;
	   
	
}
