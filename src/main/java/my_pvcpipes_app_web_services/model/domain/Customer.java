/**
 * 
 */
package my_pvcpipes_app_web_services.model.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Dcruz
 *
 */
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6231614189719647938L;
	
	// attributes
	private int id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param emailAddress
	 * @param password
	 */
	public Customer(int id, String firstName, String lastName, String emailAddress, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.password = password;
	}
	
	public String displayCustomer() {
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("\nCustomer's first name: " + firstName);
		stringBuffer.append("\nCustomer's last name: " + lastName);
		stringBuffer.append("\nCustomer's email address: " + emailAddress);
				
		return stringBuffer.toString();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + "]";
	}
	
	public boolean validate() {
		if(id == 0)
			return false;
		if(firstName == null)
			return false;
		if(lastName == null)
			return false;
		if (emailAddress == null)
			return false;
		if (password == null)
			return false;
		
		return true;
	}
	@Override
	public int hashCode() {
		return Objects.hash(emailAddress, firstName, id, lastName, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(emailAddress, other.emailAddress) && Objects.equals(firstName, other.firstName)
				&& id == other.id && Objects.equals(lastName, other.lastName)
				&& Objects.equals(password, other.password);
	}
	
	

}
