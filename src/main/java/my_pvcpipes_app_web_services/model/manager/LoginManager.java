/**
 * 
 */
package my_pvcpipes_app_web_services.model.manager;

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

}
