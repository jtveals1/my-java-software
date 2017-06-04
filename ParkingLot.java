package lab;
/**
 * 
 * @author jtveals
 * 11-14-2016
 * 
 */
public class ParkingLot {

	public static void main(String[] args) {
		Car car = new Coupe();
		car.setMake("Chervorlet");
		car.setModel("Camaro");
		car.identify();
		car.move();
	}

}
