/**
 * 
 */
package my_pvcpipes_app_web_services.model.services.authenticationservice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import my_pvcpipes_app_web_services.model.domain.Composite;
import my_pvcpipes_app_web_services.model.domain.Customer;
import my_pvcpipes_app_web_services.model.services.exception.AuthenticationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Dcruz
 *
 */
public class AuthenticationSvcJDBCImpl implements IAuthenticationSvc {
	
	Logger logger = LogManager.getLogger();

	@Override
	public Customer checkLogin(String email, String password) throws AuthenticationException {
		String sql = "SELECT * FROM customers WHERE email_address = ? and password = ?";
		Customer cust = null;
		try(Connection connection = getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);
				) {
			ps.setString(1,  email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
					
			if(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				
				cust = new Customer(id, firstName, lastName, email, password);
				rs.close();
			} else {
				rs.close();
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			logger.info(e);
			e.printStackTrace();
		}

		return cust;
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
