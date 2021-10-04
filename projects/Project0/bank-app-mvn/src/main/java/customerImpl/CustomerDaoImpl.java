package customerImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bankapp.model.Account;
import com.bankapp.model.Customer;
import com.bankapp.unit.AccountDao;
import com.bankapp.unit.CustomerDao;
import com.bankapp.unit.Util;
import com.mysql.cj.protocol.Resultset;

public class CustomerDaoImpl implements CustomerDao  {

	@Override
	public void creat(Customer customer) throws SQLException {

		try (Connection connection = Util.getConnection()) {
			String sql = "INSERT INTO customer ( FirstName , LastName, Email, password) VALUES (? ,?, ? ,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, customer.getFirstname());
			statement.setString(2, customer.getLastname());
			statement.setString(3, customer.getEmail());
			statement.setString(4, customer.getPassword());
			statement.executeUpdate();
		}

	}

	@Override
	public Customer getByEmail(String email) throws SQLException {
		try (Connection connection = Util.getConnection()) {

			String sql = "SELECT * FROM customer where email= ? ";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				Customer customer = new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setFirstname(resultSet.getString("FirstName"));
				customer.setLastname(resultSet.getString("LastName"));
				customer.setEmail(resultSet.getString("Email"));
				customer.setPassword(resultSet.getString("password"));
				
            return customer;
			}
		}
		return null;
	}





}
