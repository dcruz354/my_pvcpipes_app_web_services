/**
 * 
 */
package my_pvcpipes_app_web_services.model.manager;

import java.sql.Connection;
import java.sql.SQLException;

import my_pvcpipes_app_web_services.model.domain.Customer;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Dcruz
 *
 */
public class LoginManager {
	
	public LoginManager() { }
	
	public boolean validate(String username, String password) {
		
		// Establish validation variables
		int count = 2;
		
		boolean status = true;
		String nameInput = username;
		String passwordInput = password;
		
		// Validate name input from user
		if (nameInput != ""){
			count--;
		}
		
		// Validate password input from user
		if (passwordInput != ""){
			count--;
		}
		
		// Evaluate validation to process with a success message
		if (count == 0){
					
			
			// Evaluate validation to process with a failure message
			} else if (count > 0){
				
				status = false;
			}
			// Send status back to Customer Registration Controller
			return status;
		
	}
	
	public Customer checkLogin(String email, String password) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM customers WHERE email_address = ? and password = ?";
		Customer cust = null;
//		try(Connection connection = getConnection();
//				PreparedStatement ps = connection.prepareStatement(sql);
//				) {
//			ps.setString(1,  email);
//			ps.setString(2, password);
//			
//			ResultSet rs = ps.executeQuery();
//					
//			if(rs.next()) {
//				int id = rs.getInt("id");
//				String firstName = rs.getString("first_name");
//				String lastName = rs.getString("last_name");
//				
//				cust = new Customer(id, firstName, lastName, email, password);
//				rs.close();
//			} else {
//				rs.close();
//				
//			}
//			
//		}
		
		cust = new Customer(1, "David", "test", "test@test.com", "password");
		return cust;
		
	}
	
	// method that connects to a MySQL database
	private Connection getConnection() {
		System.out.println("connect to a MySQL database");
		Connection connection = null;
		try {
			String dbURL = "jdbc:mysql://localhost:3306/my_pvcpipes_appdb";
			String username = "root";
			String password = "admin";
			connection = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connected");
		} catch(SQLException ex)
		{
			System.out.println(ex);
		}
		
		return connection;
	}

}
