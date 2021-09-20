/**
 * 
 */
package my_pvcpipes_app_web_services.model.services.exception;

/**
 * @author Dcruz
 *
 */
public class AuthenticationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3385328618387898722L;
	
	public AuthenticationException(final String inMessage)
	{
		super(inMessage);
	}


	public AuthenticationException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}

}
