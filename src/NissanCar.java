/**
 * 
 */

/**
 * @author darce
 *
 */
public class NissanCar extends Car {

	/**
	 * 
	 */
	String make;
	public NissanCar(String name, String engine, int numDoors, String make) {
		// TODO Auto-generated constructor stub
		super(name,engine,numDoors);
		this.make=make;
	}

	/**
	 * @param args
	 */
	
	public void openTrunk() {
		System.out.println("front trunk opened");
	}
	public void useElectric() {
		System.out.println("running in Electric mode");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	    
	    


}
