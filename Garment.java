package lab;

/**
 * Garment
 * @author jtveals
 *
 */
public abstract class Garment implements Product {
	
	protected String size;
	protected String name;
	protected String description;
	protected String color;
	protected double price;
	
	/**
	 * getSize
	 * @return
	 */
	public String getSize(){
		return size;
	}
	
	/**
	 * setSize
	 * @param size
	 */
	abstract void setSize(String size);
	
	/**
	 * order
	 */
	public void order(){
		System.out.println("Your order:");
		System.out.println("Name: " + name);
		System.out.println("Price: $" + price);
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
		System.out.println("Description: " + description);
	}
}
