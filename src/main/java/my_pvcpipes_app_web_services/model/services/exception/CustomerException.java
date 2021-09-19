/**
 * 
 */
package my_pvcpipes_app_web_services.model.services.exception;

/**
 * @author Dcruz
 *
 */
public class CustomerException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -21434889220575398L;
	

	public CustomerException(final String inMessage)
	{
		super(inMessage);
	}
	
	public CustomerException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}

} // end of CustomerException class
