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
public class CustomerController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 389721723229341322L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Inside CustomerController :: doPost");
		
		String customersFirstName = req.getParameter("customersFirstName");
//		String customersLastName = req.getParameter("customersLastName");
//		String customersEmailAddress = req.getParameter("customersEmailAddress");
//		String customersPassword = req.getParameter("customersPassword");
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><body>");  
		pw.println("Congratulations, " + customersFirstName + ", your account has been successfully created.");  
		pw.println("</body></html>");  
		  
		pw.close();//closing the stream  
		
	}
	

}
