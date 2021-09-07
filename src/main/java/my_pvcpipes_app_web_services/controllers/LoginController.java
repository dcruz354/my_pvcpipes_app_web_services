/**
 * 
 */
package my_pvcpipes_app_web_services.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * @author Dcruz
 *
 */
public class LoginController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3259492020101642062L;

	/**
	 * 
	 */
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("Inside LoginController :: doPost");
		//String username = req.getParameter("usersLoginName");
		//String password = req.getParameter("usersLoginPassword");
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><body>");  
		pw.println("Welcome to servlet");  
		pw.println("</body></html>");  
		  
		pw.close();//closing the stream  
		
	}// end of doPOST

}
