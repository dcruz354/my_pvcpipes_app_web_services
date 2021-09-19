/**
 * 
 */
package my_pvcpipes_app_web_services.controllers;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import my_pvcpipes_app_web_services.model.business.manager.MyPvcPipesAppManager;
import my_pvcpipes_app_web_services.model.domain.Customer;
import my_pvcpipes_app_web_services.model.manager.LoginManager;

/**
 * @author Dcruz
 *
 */
public class LoginController extends HttpServlet{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5045207370712620700L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("Inside LoginController :: doPost");
//		String username = req.getParameter("usersLoginName");
//		String password = req.getParameter("usersLoginPassword");
		
//		LoginManager loginManager = new LoginManager();
//		
//		try {
//			Customer customer = loginManager.checkLogin(username, password);
//			String destPage = "jsp/login.jsp";
//			
//			if(customer != null) {
//				HttpSession session = req.getSession();
//				session.setAttribute("customer", customer);
//				destPage = "jsp/LoginGood.jsp";
//			} else {
//				String message = "Invalid email/password";
//				req.setAttribute("message", message);
//			}
//			
//			RequestDispatcher dispatcher = req.getRequestDispatcher(destPage);
//			dispatcher.forward(req, res);
//		} catch (SQLException | ClassNotFoundException ex) {
//			System.out.println(ex);
//		}
		
		// instantiate the manager
		MyPvcPipesAppManager manager = MyPvcPipesAppManager.getInstance();
		
		Logger logger = LogManager.getLogger();
		
		//test get all customers
		logger.info("retrieve all customers");
		boolean allRetrieved;
		allRetrieved = manager.performAction("GetAllCustomers", null);
		logger.info(allRetrieved);
				
	}// end of doPOST
	
	public boolean authenticate( String username, String password) {
		boolean isSuccess = true;
		return isSuccess;
	}

}
