/**
 * 
 */
package my_pvcpipes_app_web_services.model.business.manager;

import my_pvcpipes_app_web_services.model.business.exception.PropertyFileNotFoundException;
import my_pvcpipes_app_web_services.model.domain.Composite;
import my_pvcpipes_app_web_services.model.services.manager.PropertyManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Dcruz
 *
 */
public abstract class ManagerSuperType {
	static Logger logger = LogManager.getLogger();
	static {
		try {
			ManagerSuperType.loadProperties();
		} catch (PropertyFileNotFoundException propertyFileNotFoundException)
		{
			logger.info("Application Properties failed to be loaded - Application exiting...");
	    	System.exit(1);
		}
	}
	
	public abstract boolean performAction(String commandString, Composite composite);
	
    public static void loadProperties () throws PropertyFileNotFoundException
	{
		String propertyFileLocation = System.getProperty("prop_location");
		
        if (propertyFileLocation != null)
        { 
          // Now that we have the property file location, lets have the 
          // PropertyManager class load it up
          PropertyManager.loadProperties(propertyFileLocation);
        }
        else
        {
        	logger.info("Property file location not set. Passed in value is: " + propertyFileLocation + ".");
            throw new PropertyFileNotFoundException ("Property file location not set", null);         
        }
    	
    	
	} //end loadProperties

} // end of ManagerSuperType class
