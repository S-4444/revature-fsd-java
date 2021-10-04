package com.bankapp.unit;

import java.sql.SQLException;
import java.util.List;

import com.bankapp.model.Customer;


public interface CustomerDao {

	     void creat (Customer customer) throws SQLException;
	    
	     Customer getByEmail(String email) throws SQLException;
	   
	
}
