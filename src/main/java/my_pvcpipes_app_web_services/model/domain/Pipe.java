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
public class Pipe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6669066849819305344L;
	
	// attributes
		private int id;
		private float price;
		private String manufacturer;
		private String model;
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
		 * @return the price
		 */
		public float getPrice() {
			return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(float price) {
			this.price = price;
		}
		/**
		 * @return the manufacturer
		 */
		public String getManufacturer() {
			return manufacturer;
		}
		/**
		 * @param manufacturer the manufacturer to set
		 */
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		/**
		 * @return the model
		 */
		public String getModel() {
			return model;
		}
		/**
		 * @param model the model to set
		 */
		public void setModel(String model) {
			this.model = model;
		}
		/**
		 * @param id
		 * @param price
		 * @param manufacturer
		 * @param model
		 */
		public Pipe(int id, float price, String manufacturer, String model) {
			super();
			this.id = id;
			this.price = price;
			this.manufacturer = manufacturer;
			this.model = model;
		}
		
		/**
		 * 
		 */
		public Pipe() {
			super();
		}
		@Override
		public int hashCode() {
			return Objects.hash(id, manufacturer, model, price);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pipe other = (Pipe) obj;
			return id == other.id && Objects.equals(manufacturer, other.manufacturer) && Objects.equals(model, other.model)
					&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
		}
		@Override
		public String toString() {
			return "Pipe [id=" + id + ", price=" + price + ", manufacturer=" + manufacturer + ", model=" + model + "]";
		}
		
		public boolean validate() {
			if(price == 0.0) return false;
			if(manufacturer == null) return false;
			if(model == null) return false;
			if (id == 0) return false;
			return true;
		}
		
		public String displayPipe() {
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append("\nPrice : " + price);
			stringBuffer.append("\nManufacturer : " + manufacturer);
			stringBuffer.append("\nModel : " + model);
			return stringBuffer.toString();
		}

}
