/**
 * 
 */
package my_pvcpipes_app_web_services.model.domain;

import java.io.Serializable;

/**
 * @author Dcruz
 *
 */
public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2184947077689574740L;
	
	private String username;
	private String password;
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 
	 */
	public Login() {
		super();
	}
	
	

}
