/**
 * 
 */
package my_pvcpipes_app_web_services.controllers;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.RequestDispatcher;

/**
 * @author Dcruz
 *
 */
public class CustomerLogoutController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7169318674423133074L;
	
	
	public CustomerLogoutController() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session != null) {
			session.removeAttribute("customer");
			
			String destPage = "jsp/login.jsp";
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
			dispatcher.forward(request, response);
		}
	}
}
