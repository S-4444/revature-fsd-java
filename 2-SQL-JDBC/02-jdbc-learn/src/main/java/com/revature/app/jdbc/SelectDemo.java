package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.app.model.Employee;

public class SelectDemo {

	public static void main(String[] args) {
		
		Connection connection = null;
		try {
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver"); // this is dynamic class loading
			
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb" ,
					"root",
					"Sanjoy@1999");
			System.out.println("Connection Successfull");
			String sql= "select * from employee";
		    PreparedStatement statement = connection.prepareStatement(sql); // it is compile statement
		   ResultSet resultSet = statement.executeQuery(); // because we readin the datya base we not update the table so we use "executeQuery"
		   //  resultSet import from java.sql.ResultSet
		   
		   List<Employee> employeeList = new ArrayList<>();
		   while(resultSet.next()) {
			   Employee employee = new Employee();
			   employee.setId(resultSet.getInt("id"));
			   employee.setName (resultSet.getString("name"));
			   employee.setSalary(resultSet.getDouble("salary"));
			   employee.setGender(resultSet.getString("gender").charAt(0)); /* here we have gender variable type is char but we don't have
			                                                                  getChar only have String so we use .charAt(0)*/
	//		   employee.setDepartment(resultSet.getInt("department_id"));
			   employeeList.add(employee);
		   }
		   
		employeeList.forEach(System.out::println);
		   
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
