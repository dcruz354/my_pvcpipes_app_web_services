/**
 * 
 */
package my_pvcpipes_app_web_services.model.services.customerservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

import my_pvcpipes_app_web_services.model.domain.Composite;
import my_pvcpipes_app_web_services.model.domain.Customer;
import my_pvcpipes_app_web_services.model.services.exception.CustomerException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Dcruz
 *
 */
public class CustomerServiceJDBCImpl implements ICustomerService {
	
	Logger logger = LogManager.getLogger();

	@Override
	public boolean getAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerServiceJDBCImpl::getAllCustomers");
		String sql = "SELECT id, first_name, last_name, email, password, address "
				+ "FROM customers";
		List<Customer> customers = new ArrayList<>();
		
//		try(Connection connection = getConnection();
//				PreparedStatement ps = connection.prepareStatement(sql);
//				ResultSet rs = ps.executeQuery(sql)) {
//			while (rs.next()) {
//				int id = rs.getInt("id");
//				String firstName = rs.getString("first_name");
//				String lastName = rs.getString("last_name");
//				String email = rs.getString("email");
//				String password = rs.getString("password");
//				
//				Customer cust = new Customer(id, firstName, lastName, email, password);
//				customers.add(cust);
//			}
//			
//			if(customers != null)
//			{
//				for(Customer c: customers) {
//					logger.info(c.toString());
//				}
//			} else
//				logger.info("No customers to print");
//			
//			return true;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			logger.info(e);
//			e.printStackTrace();
//			return false;
//		}
		
		return true;
	}

	@Override
	public boolean getCustomer(Composite composite) throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerServiceJDBCImpl::getCustomer");
		boolean isSuccess = false;
		String sql = "SELECT id, first_name, last_name, email, password, address "
				+ "FROM customers "
				+ "WHERE id = ?";
		try(Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1,  composite.getCustomer().getId());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				
				Customer cust = new Customer(id, firstName, lastName, email, password);
				rs.close();
				if(cust != null)
				{
					logger.info(cust.toString());
					isSuccess = true;
				}
			} else {
				rs.close();
				logger.info("Customer is null");
				isSuccess = false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.info(e);
			e.printStackTrace();
			isSuccess = false;
		}
		return isSuccess;
	}

	@Override
	public boolean addCustomer(Composite composite) throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerServiceJDBCImpl::addCustomer");
		boolean isSuccess = false;
		String sql = "INSERT INTO customers (id, first_name, last_name, email, password, address) " 
		+ "VALUES (?, ?, ?, ?, ?, ?)";
		try(Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, composite.getCustomer().getId());
			ps.setString(2, composite.getCustomer().getFirstName());
			ps.setString(3, composite.getCustomer().getLastName());
			ps.setString(4,  composite.getCustomer().getEmailAddress());
			ps.setString(5, composite.getCustomer().getPassword());
			ps.setString(6, null);
			ps.executeUpdate();
			isSuccess = true;
			logger.info("Added Customer to the database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.info(e);
			e.printStackTrace();
			logger.info("Failed to add customer to the database");
			isSuccess = false;
		}
		return isSuccess;
	}

	@Override
	public boolean updateCustomer(Composite composite) throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerServiceJDBCImpl::updateCustomer");
		boolean isSuccess = false;
		String sql = "UPDATE customers SET " 
				+ " first_name = ?, "
				+ " last_name = ?, "
				+ " email = ?, "
				+ " password = ?, "
				+ " address = ? "
				+ " WHERE id = ?";
		try(Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setString(1, composite.getCustomer().getFirstName());
			ps.setString(2, composite.getCustomer().getLastName());
			ps.setString(3, composite.getCustomer().getEmailAddress());
			ps.setString(4, composite.getCustomer().getPassword());
			ps.setString(5, null);
			ps.setInt(6, composite.getCustomer().getId());
			ps.executeUpdate();
			isSuccess = true;
			logger.info("Updated Customer");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.info(e);
			e.printStackTrace();
			logger.info("Failed to update Customer");
			isSuccess = false;
		}
		return isSuccess;
	}

	@Override
	public boolean deleteCustomer(Composite composite) throws CustomerException {
		// TODO Auto-generated method stub
		logger.info("Inside CustomerServiceJDBCImpl::deleteCustomer");
		boolean isSuccess = false;
		String sql = "DELETE FROM customers " 
				+ "WHERE id = ?";
		try(Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setInt(1,  composite.getCustomer().getId());
			ps.execute();
			logger.info("Deleted Customer from the database");
			isSuccess = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.info(e);
			e.printStackTrace();
			logger.info("Failed to delete customer from the database");
			isSuccess = false;
		}
		return isSuccess;
	}

	@Override
	public List<Customer> returnAllCustomersList() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}
	
	// method that connects to a MySQL database
	private Connection getConnection() {
		logger.info("connect to a MySQL database");
		Connection connection = null;
		try {
			String dbURL = "jdbc:mysql://localhost:3306/my_pvcpipes_appdb";
			String username = "root";
			String password = "admin";
			connection = DriverManager.getConnection(dbURL, username, password);
			logger.info("Connected");
		} catch(SQLException ex)
		{
			logger.info(ex);
		}
		
		return connection;
	}

}
