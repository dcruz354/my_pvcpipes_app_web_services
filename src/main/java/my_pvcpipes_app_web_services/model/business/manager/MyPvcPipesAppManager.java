/**
 * 
 */
package my_pvcpipes_app_web_services.model.business.manager;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import my_pvcpipes_app_web_services.model.business.exception.ServiceLoadException;
import my_pvcpipes_app_web_services.model.domain.Composite;
import my_pvcpipes_app_web_services.model.domain.Customer;
import my_pvcpipes_app_web_services.model.services.authenticationservice.IAuthenticationSvc;
import my_pvcpipes_app_web_services.model.services.customerservice.ICustomerService;
import my_pvcpipes_app_web_services.model.services.exception.AuthenticationException;
import my_pvcpipes_app_web_services.model.services.exception.CustomerException;
import my_pvcpipes_app_web_services.model.services.factory.ServiceFactory;

/**
 * @author Dcruz
 *
 */
public class MyPvcPipesAppManager extends ManagerSuperType{
	
	Logger logger = LogManager.getLogger();
	private static MyPvcPipesAppManager _instance;
	
	private MyPvcPipesAppManager() {
		
	}
	
	public static synchronized MyPvcPipesAppManager getInstance() {
		if (_instance == null) {
			_instance = new MyPvcPipesAppManager();
		}
		return _instance;
	}

	@Override
	public boolean performAction(String commandString, Composite composite) {
		boolean action = false;
		if(commandString.equals("GetAllCustomers")) {
			action = getAllCustomers(ICustomerService.NAME);
		} else if (commandString.equals("AddCustomer")) {
			action = addCustomer(ICustomerService.NAME, composite);
		} else if (commandString.equals("UpdateCustomer")) {
			action = updateCustomer(ICustomerService.NAME, composite);
		} else if (commandString.equals("DeleteCustomer")) {
			action = deleteCustomer(ICustomerService.NAME, composite);
		} else if (commandString.equals("GetCustomer")) {
			action = getCustomer(ICustomerService.NAME, composite);
		}
		
		return action;
	}
	
	public List<Customer> performActionReturnValues(String commandString, Composite composite) {
		List<Customer> customersList = null;
		
		if(commandString.equals("ReturnAllCustomersList")) {
			customersList = returnAllCustomersList(ICustomerService.NAME);
		}
		
		return customersList;
	}
	
	public Customer performActionReturnCustomer(String commandString, String email, String password) {
		Customer customer = null;
		
		if(commandString.equals("ReturnCustomer")) {
			customer = returnCustomer(IAuthenticationSvc.NAME, email, password);
		}
		
		return customer;
	}
	
	public Customer returnCustomer(String commandString, String email, String password) {
		Customer customer = null;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		IAuthenticationSvc iAuthenticationSvc;
		
		try {
			iAuthenticationSvc = (IAuthenticationSvc) serviceFactory.getService(commandString);
			customer = iAuthenticationSvc.checkLogin(email, password);
		}  catch (ServiceLoadException e1) {
			logger.info("MyPvcPipesAppManager::returnCustomer failed");
		} catch (AuthenticationException  e) {
			// TODO Auto-generated catch block
			logger.info("MyPvcPipesAppManager::returnCustomer failed");
			e.printStackTrace();
		}
		
		return customer;
	}
	
	public List<Customer> returnAllCustomersList(String commandString) {
		List<Customer> customersList = null;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ICustomerService iCustomerService;
		
		try {
			iCustomerService = (ICustomerService) serviceFactory.getService(commandString);
			customersList = iCustomerService.returnAllCustomersList();
		}  catch (ServiceLoadException e1) {
			logger.info("MyPvcPipesAppManager::returnAllCustomersList failed");
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			logger.info("MyPvcPipesAppManager::returnAllCustomersList failed");
			e.printStackTrace();
		}
		
		return customersList;
	}
		
	public boolean getCustomer(String commandString, Composite composite) {
		boolean isSuccess = false;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ICustomerService iCustomerService;
		
		try {
			iCustomerService = (ICustomerService) serviceFactory.getService(commandString);
			isSuccess = iCustomerService.getCustomer(composite);
		}  catch (ServiceLoadException e1) {
			logger.info("MyPvcPipesAppManager::getCustomer failed");
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			logger.info("MyPvcPipesAppManager::getCustomer failed");
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
	public boolean deleteCustomer(String commandString, Composite composite) {
		boolean isSuccess = false;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ICustomerService iCustomerService;
		
		try {
			iCustomerService = (ICustomerService) serviceFactory.getService(commandString);
			isSuccess = iCustomerService.deleteCustomer(composite);
		}  catch (ServiceLoadException e1) {
			logger.info("MyPvcPipesAppManager::deleteCustomer failed");
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			logger.info("MyPvcPipesAppManager::deleteCustomer failed");
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public boolean updateCustomer(String commandString, Composite composite) {
		boolean isSuccess = false;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ICustomerService iCustomerService;
		
		try {
			iCustomerService = (ICustomerService) serviceFactory.getService(commandString);
			isSuccess = iCustomerService.updateCustomer(composite);
		}  catch (ServiceLoadException e1) {
			logger.info("MyPvcPipesAppManager::updateCustomer failed");
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			logger.info("MyPvcPipesAppManager::updateCustomer failed");
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public boolean addCustomer(String commandString, Composite composite) {
		boolean isSuccess = false;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ICustomerService iCustomerService;
		
		try {
			iCustomerService = (ICustomerService) serviceFactory.getService(commandString);
			isSuccess = iCustomerService.addCustomer(composite);
		}  catch (ServiceLoadException e1) {
			logger.info("MyPvcPipesAppManager::addCustomer failed");
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			logger.info("MyPvcPipesAppManager::addCustomer failed");
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public boolean getAllCustomers(String commandString) {
		boolean isSuccess = false;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ICustomerService iCustomerService;
		
		try {
			iCustomerService = (ICustomerService) serviceFactory.getService(commandString);
			isSuccess = iCustomerService.getAllCustomers();
		}  catch (ServiceLoadException e1) {
			logger.info("MyPvcPipesAppManager::listCustomers failed :: ServiceLoadException");
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			logger.info("MyPvcPipesAppManager::listCustomers failed :: CustomerException");
			e.printStackTrace();
		}
		
		return isSuccess;
	}

} // end of class
