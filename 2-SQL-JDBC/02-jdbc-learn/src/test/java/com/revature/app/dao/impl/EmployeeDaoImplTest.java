package com.revature.app.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.app.dao.EmlpoyeeDao;
import com.revature.app.model.Employee;

class EmployeeDaoImplTest {

	@Test
	void testList_Success() {
		
		EmlpoyeeDao dao=new EmployeeDaoImpl();
		try {
			assertTrue(dao.list().size() >0);
		} catch(SQLException e) {
			fail("Getting employee list failed");
		}
		
		}
	@Test
	void testGet_Success() {
		EmlpoyeeDao dao = new EmployeeDaoImpl();
		try {
			Employee employee = dao.get(1);
			assertEquals(1 , employee.getId() , "Incorrect User Return");
		} catch (SQLException e) {
			fail("Getting employee list failed");
		}
		
	}

}
