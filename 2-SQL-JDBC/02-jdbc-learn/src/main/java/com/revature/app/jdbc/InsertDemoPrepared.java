package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemoPrepared {

	public static void main(String[] args) {
	
		Connection connection = null;
		try {
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver"); // this is dynamic class loading
			
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb" ,
					"root",
					"Sanjoy@1999");
			System.out.println("Connection Successfull");
			String sql= "insert into department (name) values (?,?)";
		    PreparedStatement statement = connection.prepareStatement(sql); // it is compile statement
		    statement.setString(1, "Research"); // this is bind value
		    statement.setInt(1, 5); // this is bind value
		    statement.executeUpdate();
		   
		    statement.setString(1, "Statistic");
		    statement.executeUpdate();
//		    
//		    String sql = "insert into employee (name, salary, gender, department_id) values (?, ?, ?, ?)";
//			PreparedStatement statement = connection.prepareStatement(sql);
//			statement.setString(1, "Jacob");
//			statement.setDouble(2, 1500.0);
//			statement.setString(3, "M");
//			statement.setInt(4, 2);
//			statement.executeUpdate();
//			connection.close();
			
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
