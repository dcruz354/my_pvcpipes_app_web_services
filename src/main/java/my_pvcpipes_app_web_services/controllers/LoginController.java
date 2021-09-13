/**
 * 
 */
package my_pvcpipes_app_web_services.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
		String username = req.getParameter("usersLoginName");
		String password = req.getParameter("usersLoginPassword");
		
		
		if(authenticate(username, password)) {
			getServletContext().getRequestDispatcher("/LoginGood.jsp").forward(req, res);
		} else {
			getServletContext().getRequestDispatcher("/LoginError.jsp").forward(req, res);
		}
		
	}// end of doPOST
	
	public boolean authenticate( String username, String password) {
		boolean isSuccess = true;
		return isSuccess;
	}

}
