/**
 * 
 */
package my_pvcpipes_app_web_services.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Dcruz
 *
 */
public class CustomerTest {
	Logger logger = LogManager.getLogger();
	
	private Customer customer1, customer2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		customer1 = new Customer(1, "David", "Test", "test@test.com", "1234");
		customer2 = new Customer(1, "David", "Test", "test@test.com", "1234");
	}

	/**
	 * Test method for {@link my_pvcpipes_app_web_services.model.domain.Customer#validate()}.
	 */
	@Test
	public void testValidate() {
		logger.info("starting testValidate()");
		assertTrue ("customer1 validates", customer1.validate());
		logger.info("testValidate PASSED");
	}

	/**
	 * Test method for {@link my_pvcpipes_app_web_services.model.domain.Customer#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		logger.info("starting testEqualsObject()");
		assertTrue ("customer1 equals customer2", customer1.equals(customer2));
		logger.info("testEqualsObject PASSED");
	}

}
