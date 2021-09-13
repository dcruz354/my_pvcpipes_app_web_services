package my_pvcpipes_app_web_services.model.manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoginManagerTest {
	LoginManager loginManager;
	@Before
	public void setUp() throws Exception {
		loginManager = new LoginManager();
	}

	@Test
	public void testValidate() {
		System.out.println("starting testValidate()");
		String userName = "";
		String password = "";
		assertFalse(loginManager.validate(userName, password));
		System.out.println("testValidate PASSED");
	}

}
