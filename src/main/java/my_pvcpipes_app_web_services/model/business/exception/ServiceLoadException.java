/**
 * 
 */
package my_pvcpipes_app_web_services.model.business.exception;

/**
 * @author Dcruz
 *
 */
public class ServiceLoadException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1102150181592218942L;
	
	public ServiceLoadException(final String inMessage, final Throwable inNestedException)
	{
		super(inMessage, inNestedException);
	}

} // end of ServiceLoadException class
