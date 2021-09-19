/**
 * 
 */
package my_pvcpipes_app_web_services.model.domain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Dcruz
 *
 */
public class Composite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2817229164641791220L;
	
	// attributes
		private Customer customer;
		private Pipe pipe;
		private Order order;
		private ArrayList<Pipe> pipeList;
		private ArrayList<Order> orderList;
		private ArrayList<Customer> customerList;
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
		/**
		 * @return the order
		 */
		public Order getOrder() {
			return order;
		}
		/**
		 * @param order the order to set
		 */
		public void setOrder(Order order) {
			this.order = order;
		}
		/**
		 * @return the pipeList
		 */
		public ArrayList<Pipe> getPipeList() {
			return pipeList;
		}
		/**
		 * @param pipeList the pipeList to set
		 */
		public void setPipeList(ArrayList<Pipe> pipeList) {
			this.pipeList = pipeList;
		}
		/**
		 * @return the orderList
		 */
		public ArrayList<Order> getOrderList() {
			return orderList;
		}
		/**
		 * @param orderList the orderList to set
		 */
		public void setOrderList(ArrayList<Order> orderList) {
			this.orderList = orderList;
		}
		/**
		 * @return the customerList
		 */
		public ArrayList<Customer> getCustomerList() {
			return customerList;
		}
		/**
		 * @param customerList the customerList to set
		 */
		public void setCustomerList(ArrayList<Customer> customerList) {
			this.customerList = customerList;
		}
		
		// clear all values
		public void clear() {
			pipe = null;
			order = null;
			customer = null;
			pipeList = null;
			orderList = null;
			customerList = null;
		}
		@Override
		public String toString() {
			return "Composite [customer=" + customer + ", pipe=" + pipe + ", order=" + order + ", pipeList=" + pipeList
					+ ", orderList=" + orderList + ", customerList=" + customerList + "]";
		}
}
