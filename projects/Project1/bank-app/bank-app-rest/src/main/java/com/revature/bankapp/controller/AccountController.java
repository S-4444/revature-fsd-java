package com.revature.bankapp.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.bankapp.dao.AccountDao;
import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Transaction;

@Path("/accounts")
public class AccountController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);
	private AccountDaoImpl dao = new AccountDaoImpl();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Account account) {
		LOGGER.info("Start");
		LOGGER.debug("{}", account);

		try {
			dao.create(account);
			LOGGER.info("End");
			return Response.ok().build();
		} catch (SQLException e) {
			return Response.status(500).build();

		}

	}
	@PUT
	@Path("/deposit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deposit(Account accountDetails) {
		try {
		     Account account = dao.currentAccount(accountDetails.getAccount_no());
		     double balance= account.getBalance();
		     balance +=accountDetails.getBalance();
		     account.setBalance(balance);
		     dao.insert(new Transaction('D' , accountDetails.getBalance()));
		     dao.update(account);
		     return Response.status(200).build();
		}catch(SQLException e) {
			return Response.status(500).build();
		}
	}
	
	@PUT
	@Path("/widthdraw")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response widthdraw(Account accountDetails) {
		try {
		     Account account = dao.currentAccount(accountDetails.getAccount_no());
		     double balance= account.getBalance();
		     balance -=accountDetails.getBalance();
		     account.setBalance(balance);
		     dao.insert(new Transaction('W' , accountDetails.getBalance()));
		     dao.update(account);
		     return Response.status(200).build();
		}catch(SQLException e) {
			return Response.status(500).build();
		}
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response get() {
		try {
			List<Account> accountList;
			accountList = dao.showAccounts();
			return Response
					.ok()
					.entity(accountList)
					.build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(500).build();
		}

	}
	

}
