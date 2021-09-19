/**
 * 
 */
package my_pvcpipes_app_web_services.controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




/**
 * @author Dcruz
 *
 */
public class WelcomeController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5811534009403483520L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
			
			String number = req.getParameter("welcomeRequest");
			
			//Evaluate status and forward the process results
			if(number.equalsIgnoreCase("1")){
			
				String destPage = "jsp/login.jsp";
				RequestDispatcher dispatcher = req.getRequestDispatcher(destPage);
				dispatcher.forward(req, res);
			
			} else {
				getServletContext().getRequestDispatcher("/customerRegistration.html").forward(req, res);
			}
					
		}// end of doPOST

}
