package com.revature.app.controller;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.revature.app.dao.EmlpoyeeDao;
import com.revature.app.dao.impl.EmployeeDaoImpl;
import com.revature.app.model.Employee;

@Path("/employees")
public class EmployeeController {
	EmlpoyeeDao dao = new EmployeeDaoImpl();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response List() {

		List<Employee> employeeList;
		try {
			employeeList = dao.list();
			return Response.ok().entity(employeeList).build();
		} catch (SQLException e) {
			return Response.status(500).build();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Employee employee) {
		try {
			dao.create(employee);
			return Response.ok().build();
		} catch (SQLException e) {
			return Response.status(500).build();
		}
	}
}
