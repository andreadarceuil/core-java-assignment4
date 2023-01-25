/**
 * 
 */

/**
 * @author darce
 *
 */
public class TeslaCar extends Car {

	/**
	 * 
	 */

	String make;
	public TeslaCar(String name, String engine, int numDoors, String make) {
		// TODO Auto-generated constructor stub
		super(name,engine,numDoors);
		this.make=make;
	}

	/**
	 * @param args
	 * Methods
	 */
	public void openTrunk() {
		System.out.println("front trunk opened");
	}
	public void cruiseControl() {
		System.out.println("Cruise control started");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
