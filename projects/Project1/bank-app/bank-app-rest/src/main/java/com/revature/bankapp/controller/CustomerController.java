package com.revature.bankapp.controller;

import java.sql.SQLException;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Customer;

@Path("/customers")
public class CustomerController {
        
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	private CustomerDao dao = new CustomerDaoImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Customer customer) {
		LOGGER.info("Start");
		LOGGER.debug("{}", customer);
		try {
			dao.creat(customer);
			LOGGER.info("End");
			return Response.ok().build();
		} catch (AppException e) {
			return Response.status(500).build();
		}
	}

	
	@GET
	@Path("/{email}/{password}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("email") String email, @PathParam("password") String password) {
		LOGGER.info("start");
		Customer customer =new Customer();
		try {
			customer=dao.getByEmail(email);
			if(customer==null) {
				LOGGER.info("Invalid password or Email");
				return Response.status(401).build();
			} else if(customer.getPassword().equals(password)) {
				LOGGER.info("Loging Sucessfull");
				LOGGER.debug("{}" , customer);
				return Response.ok().entity(customer).build();
			}else {
				LOGGER.info("Invalid Password or Email");
				return Response.status(404).build();
			}
		}
		 catch (SQLException e) {
		
			return Response.status(500).build();
		}
			
	
	}
}
