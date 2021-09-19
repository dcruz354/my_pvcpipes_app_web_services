/**
 * 
 */
package my_pvcpipes_app_web_services.model.business.exception;

/**
 * @author Dcruz
 *
 */
public class PropertyFileNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 896274271514585105L;
	
	public PropertyFileNotFoundException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}
} // end of PropertyFileNotFoundException class
