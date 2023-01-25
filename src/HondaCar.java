/**
 * 
 */

/**
 * @author darce
 *
 */
public class HondaCar extends Car {

	/**
	 * 
	 */
	String make;
	public HondaCar(String name, String engine, int numDoors, String make) {
		super(name,engine,numDoors);
		this.make=make;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public void openTrunk() {
		System.out.println("back trunk opened");
	}
	public void startNavigationSystem() {
		System.out.println("Navigation started");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
