/**
 * 
 */
package my_pvcpipes_app_web_services.model.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Dcruz
 *
 */
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1915927043127283213L;
	
	// attributes
		private int id;
		private LocalDateTime date;
		private Customer customer;
		private Pipe pipe;
		
		/**
		 * 
		 */
		public Order() {
			super();
		}

		/**
		 * @param id
		 * @param date
		 * @param customer
		 * @param pipe
		 */
		public Order(int id, LocalDateTime date, Customer customer, Pipe pipe) {
			super();
			this.id = id;
			this.date = date;
			this.customer = customer;
			this.pipe = pipe;
		}

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
		 * @return the date
		 */
		public LocalDateTime getDate() {
			return date;
		}

		/**
		 * @param date the date to set
		 */
		public void setDate(LocalDateTime date) {
			this.date = date;
		}

		/**
		 * @return the customer
		 */
		public Customer getCustomer() {
			return customer;
		}

		/**
		 * @param customer the customer to set
		 */
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		/**
		 * @return the pipe
		 */
		public Pipe getPipe() {
			return pipe;
		}

		/**
		 * @param pipe the pipe to set
		 */
		public void setPipe(Pipe pipe) {
			this.pipe = pipe;
		}
		
		public boolean validate() {
			if(date == null)
				return false;
			if (customer == null)
				return false;
			if (pipe == null)
				return false;
			return true;
		}

		@Override
		public int hashCode() {
			return Objects.hash(customer, date, id, pipe);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Order other = (Order) obj;
			return Objects.equals(customer, other.customer) && Objects.equals(date, other.date) && id == other.id
					&& Objects.equals(pipe, other.pipe);
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", date=" + date + ", customer=" + customer + ", pipe=" + pipe + "]";
		}

}
