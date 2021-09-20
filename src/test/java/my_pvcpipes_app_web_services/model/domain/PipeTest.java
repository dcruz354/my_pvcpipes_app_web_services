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
public class PipeTest {
	Logger logger = LogManager.getLogger();
	
	private Pipe pipe1, pipe2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pipe1 = new Pipe(1, 20.00f, "manufacturer", "model1");
		pipe2 = new Pipe(1, 20.00f, "manufacturer", "model1");
	}

	/**
	 * Test method for {@link my_pvcpipes_app_web_services.model.domain.Pipe#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		logger.info("starting testEqualsObject()");
		assertTrue ("pipe1 equals pipe2", pipe1.equals(pipe2));
		logger.info("testEqualsObject PASSED");
	}

	/**
	 * Test method for {@link my_pvcpipes_app_web_services.model.domain.Pipe#validate()}.
	 */
	@Test
	public void testValidate() {
		logger.info("starting testValidatePipe()");
		assertTrue ("pipe validates", pipe1.validate());
		logger.info("testValidate PASSED");
	}

}
