/**
 * 
 */
package my_pvcpipes_app_web_services.model.services.customerservice;

import java.util.List;

import my_pvcpipes_app_web_services.model.domain.Composite;
import my_pvcpipes_app_web_services.model.domain.Customer;
import my_pvcpipes_app_web_services.model.services.exception.CustomerException;

/**
 * @author Dcruz
 *
 */
public interface ICustomerService {
	public final String NAME = "ICustomerService";
	
	public boolean getAllCustomers() throws CustomerException;
	public boolean getCustomer(Composite composite) throws CustomerException;
	public boolean addCustomer(Composite composite) throws CustomerException;
	public boolean updateCustomer(Composite composite) throws CustomerException;
	public boolean deleteCustomer(Composite composite) throws CustomerException;
	public List<Customer> returnAllCustomersList() throws CustomerException;

}
