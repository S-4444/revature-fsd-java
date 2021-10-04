package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
	
		Connection connection = null;
		try {
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver"); // this is dynamic class loading
			
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb" ,
					"root",
					"Sanjoy@1999");
			System.out.println("Connection Successfull");
			String sql= "insert into department (name) values ('Innovation')";// its just a string .
		    Statement statement = connection.createStatement();// this is for creat the query.
		    statement.executeUpdate(sql);// this is for execute the query .
		    
		    //this is a SQL Injection.....
		    
		   /* String departmentName = "Statistics";
			String sql1 = "insert into department (name) values ('" + departmentName + "')";
			statement.executeUpdate(sql);
			
			departmentName = "Research";
			sql = "insert into department (name) values ('" + departmentName + "')";
			statement.executeUpdate(sql);
			
			String email = "123@gmail.com' or 1 = 1";
			sql = "select * from user where email = '" + email + "'";
			
			
			sql = "select * from user where email = '123@gmail.com' or 1 = 1";*/
		    
		    
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		

	}

}
