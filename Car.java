package lab;

/**
 * 
 * @author jtveals
 *
 */
public abstract class Car implements Vehicle {
	
	protected double miles;
	protected String color;
	protected int doors;
	protected String make;
	protected String model;
	
	/**
	 * Car
	 */
	public Car(){
		this.miles = 0;
	    this.color = "black";
	    this.doors = 4;	
	}

	/**
	 * setMake
	 * @param make
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * getMake
	 * @return make
	 */
	public String getMake() {
		return this.make;
	}
	
	/**
	 * setModel
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * getModel
	 * @return model
	 */
	public String getModel() {
		return this.model;
	}
	/**
	 * getMiles
	 * @return miles
	 */
    public double getMiles() {
    	return this.miles;
    }
    /**
     * setMiles
     * @param miles
     */
    public void setMiles(double miles) {
    	this.miles = miles;
    }
    /**
     * getColor
     * @return color
     */
    public String getColor() {
    	return this.color;
    }
    /**
     * setColor
     * @param color
     */
    public void setColor(String color) {
    	this.color = color;
    }
    
    /**
     * identify
     */
    public void identify () {
    	System.out.println("The make of the car is " + this.make);
    	System.out.println("The model of the car is " + this.model);
    	System.out.println("The color of the car is " + this.color);
    	System.out.println("The car has " + this.doors + " doors");
    	System.out.println("The car has " + this.miles + " miles");
    }


}
