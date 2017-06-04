package lab;

/**
 * Hat
 * @author jtveals
 *
 */
public class Hat extends Garment {
	
	/**
	 * Hat Constructor
	 * @param name
	 * @param description
	 * @param color
	 * @param price
	 */
	public Hat(String name,String description,String color,double price) {
		this.name = name;
		this.description = description;
		this.color = color;
		this.price = price;
		this.size = "One Size";
	}
	
	/**
	 * getPrice
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * setPrice
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * getName
	 */
	public String getName() {
		return name;
	}
	/**
	 * setName
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getDescription
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * setDescription
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * getColor
	 */
	public String getColor() {
		return color;
	}
	/**
	 * setColor
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * setSize
	 */
	public void setSize(String size) {
		this.size = size;
	}
}
