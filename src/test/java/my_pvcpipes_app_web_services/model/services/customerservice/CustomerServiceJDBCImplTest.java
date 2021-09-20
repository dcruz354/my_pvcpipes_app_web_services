/**
 * 
 */
package my_pvcpipes_app_web_services.model.services.customerservice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import my_pvcpipes_app_web_services.model.business.exception.ServiceLoadException;
import my_pvcpipes_app_web_services.model.domain.Composite;
import my_pvcpipes_app_web_services.model.domain.Customer;
import my_pvcpipes_app_web_services.model.services.exception.CustomerException;
import my_pvcpipes_app_web_services.model.services.factory.ServiceFactory;
import my_pvcpipes_app_web_services.model.services.manager.PropertyManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * @author Dcruz
 *
 */
public class CustomerServiceJDBCImplTest {
	Logger logger = LogManager.getLogger();
	
	ServiceFactory serviceFactory;
	Composite composite;
	Customer customer;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		String propertyFileLocation = System.getProperty("prop_location");
		PropertyManager.loadProperties(propertyFileLocation);
		serviceFactory = ServiceFactory.getInstance();
		
		customer = new Customer(14, "David", "Cruz", "cruz@test.com", "password");
		
		composite.setCustomer(customer);
		
	}

	/**
	 * Test method for {@link my_pvcpipes_app_web_services.model.services.customerservice.CustomerServiceJDBCImpl#getAllCustomers()}.
	 */
	@Ignore
	@Test
	public void testGetAllCustomers() {
		logger.info("CustomerServiceJDBCImplTest::testGetAllCustomers");
		
		ICustomerService customerService;
		try {
			customerService = (ICustomerService) serviceFactory.getService(ICustomerService.NAME);
			assertTrue(customerService.getAllCustomers());
		} catch(ServiceLoadException e) {
			logger.info("failed ServiceLoadException");
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("failed CustomerException");
		} 
	}

	/**
	 * Test method for {@link my_pvcpipes_app_web_services.model.services.customerservice.CustomerServiceJDBCImpl#getCustomer(my_pvcpipes_app_web_services.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testGetCustomer() {
		logger.info("CustomerServiceJDBCImplTest::testGetCustomer");
		ICustomerService customerService;
		try {
			customerService = (ICustomerService) serviceFactory.getService(ICustomerService.NAME);
			assertTrue(customerService.getCustomer(composite));
		} catch(ServiceLoadException e) {
			logger.info("failed ServiceLoadException");
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("failed CustomerException");
		} 
	}

	/**
	 * Test method for {@link my_pvcpipes_app_web_services.model.services.customerservice.CustomerServiceJDBCImpl#addCustomer(my_pvcpipes_app_web_services.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testAddCustomer() {
		 logger.info("CustomerServiceJDBCImplTest::testAddCustomer");
		 ICustomerService customerService; 
		 try { 
			 customerService = (ICustomerService)
					 serviceFactory.getService(ICustomerService.NAME);
			 assertTrue(customerService.addCustomer(composite)); }
		 catch(ServiceLoadException e) { 
			 logger.info("failed ServiceLoadException"); 
			 }
		 catch (CustomerException e) { 
			 // TODO Auto-generated catch block
		 e.printStackTrace(); logger.info("failed CustomerException"); 
		 }
	}

	/**
	 * Test method for {@link my_pvcpipes_app_web_services.model.services.customerservice.CustomerServiceJDBCImpl#updateCustomer(my_pvcpipes_app_web_services.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testUpdateCustomer() {
		 logger.info("CustomerServiceJDBCImplTest::testUpdateCustomer");
		 ICustomerService customerService; try { customerService = (ICustomerService)
		 serviceFactory.getService(ICustomerService.NAME);
		 assertTrue(customerService.updateCustomer(composite)); }
		 catch(ServiceLoadException e) { logger.info("failed ServiceLoadException"); }
		 catch (CustomerException e) { // TODO Auto-generated catch block
		 e.printStackTrace(); logger.info("failed CustomerException"); } 
	}

	/**
	 * Test method for {@link my_pvcpipes_app_web_services.model.services.customerservice.CustomerServiceJDBCImpl#deleteCustomer(my_pvcpipes_app_web_services.model.domain.Composite)}.
	 */
	@Ignore
	@Test
	public void testDeleteCustomer() {
		 logger.info("CustomerServiceJDBCImplTest::testDeleteCustomer");
		 ICustomerService customerService; try { customerService = (ICustomerService)
		 serviceFactory.getService(ICustomerService.NAME);
		 assertTrue(customerService.deleteCustomer(composite)); }
		 catch(ServiceLoadException e) { logger.info("failed ServiceLoadException"); }
		 catch (CustomerException e) { // TODO Auto-generated catch block
		 e.printStackTrace(); logger.info("failed CustomerException"); }
	}

	/**
	 * Test method for {@link my_pvcpipes_app_web_services.model.services.customerservice.CustomerServiceJDBCImpl#returnAllCustomersList()}.
	 */
	@Ignore
	@Test
	public void testReturnAllCustomersList() {
		fail("Not yet implemented");
	}

}
