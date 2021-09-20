/**
 * 
 */
package my_pvcpipes_app_web_services.model.services.authenticationservice;

import my_pvcpipes_app_web_services.model.domain.Composite;
import my_pvcpipes_app_web_services.model.domain.Customer;
import my_pvcpipes_app_web_services.model.services.IService;
import my_pvcpipes_app_web_services.model.services.exception.AuthenticationException;

/**
 * @author Dcruz
 *
 */
public interface IAuthenticationSvc extends IService {
	public final String NAME = "IAuthenticationSvc";
	
	public Customer checkLogin(String email, String password) throws AuthenticationException;

}
