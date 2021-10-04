package com.bankapp.unit;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bankapp.model.Account;

public interface AccountDao {
	
	void create(Account account) throws SQLException;
	
	ArrayList<Account> showAccounts() throws SQLException;

}
