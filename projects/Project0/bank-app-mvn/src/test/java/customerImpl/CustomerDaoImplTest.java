package customerImpl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.bankapp.model.Account;
import com.bankapp.model.Customer;
import com.bankapp.unit.CustomerDao;

class CustomerDaoImplTest {

	@Test
	void test() {
		
		CustomerDaoImpl customerDao = new CustomerDaoImpl();
		try {
			customerDao.creat(new Customer("DASAf" , "fgasf" , "hafgsd" , "4GHFYf"));
		} catch (SQLException e) {
			fail("Customer Not Entered");
		}
		
		
	}
	@Test
	void testGet_Success() {
		CustomerDao dao = new CustomerDaoImpl();
		try {
			    Customer customer = dao.getByEmail("r@gmail.com");
			assertEquals("Rai", customer.getFirstname() , "Incorrect user returned.");
		} catch (SQLException e) {
			e.printStackTrace();
			fail("Getting employee list failed.");
		}
	}
	
	@Test
	void test1() {
		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
	    Account account = new Account();
		account.setBalance(6000);
		account.setFirst_name("Babai");
		account.setLast_name("das");
		account.setBranch("kolkata");
		try {
			accountDaoImpl.create(account);
		} catch (SQLException e) {
			
			e.printStackTrace();
			fail("Getting employee list failed.");
		}
	}

}
