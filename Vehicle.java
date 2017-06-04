package lab;
/**
 * 
 * @author jtveals
 *
 */
public interface Vehicle {

    abstract double getMiles();
    
    abstract void setMiles(double miles);
    
    abstract String getColor();
    
    abstract void setColor(String color);
    
    abstract void move(); 
    
    abstract void identify ();


}
