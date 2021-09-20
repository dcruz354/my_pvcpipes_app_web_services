package my_pvcpipes_app_web_services.model.services.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import my_pvcpipes_app_web_services.model.business.exception.ServiceLoadException;
import my_pvcpipes_app_web_services.model.services.customerservice.CustomerServiceJDBCImpl;
import my_pvcpipes_app_web_services.model.services.customerservice.ICustomerService;
import my_pvcpipes_app_web_services.model.services.manager.PropertyManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceFactoryTest {
	Logger logger = LogManager.getLogger();
	
	ServiceFactory serviceFactory;
	
	

	@Before
	public void setUp() throws Exception {
		String propertyFileLocation = System.getProperty("prop_location");
		PropertyManager.loadProperties(propertyFileLocation);
		serviceFactory = ServiceFactory.getInstance();
	}

	@Test
	public void testGetService() {
		ICustomerService customerService;
		try {
			customerService = (ICustomerService)serviceFactory.getService(ICustomerService.NAME);
			assertTrue(customerService instanceof CustomerServiceJDBCImpl);
			logger.info("testGetCustomerService PASSED");
		} catch (ServiceLoadException e) {
			logger.info("ServiceLoadException");
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}

}
