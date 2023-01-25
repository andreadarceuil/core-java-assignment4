/**
 * 
 */

/**
 * @author darce
 *
 */
public class Car {
	
	/**
	 * 1. Create a base class called Car. It should have attributes that are appropriate for a generic car class 
	 * (things that might be present for all cars like engine, doors, wheels etc.). 
	 * Add more attributes according to your imagination. 

Constructor should initialize number of doors and name of the car. Set wheels to 4. 
Passed parameters to the constructor should only be name, doors and engine. 

Create appropriate getters and setters. 

Create some generic methods, like startEngine(it can print something like “Engine Started”), 
accelerate and brake. Add one or two more methods according to your imagination. 

Now create 3 subclasses (child classes) for three different cars. 
Override the appropriate methods to show polymorphism. The parent class has some methods that 
can be overridden by the child classes. Only override some methods, not all. 
There should be some methods of the parent class that are overridden and some methods that are not overridden. 
The child classes should have their own unique attributes and methods in addition to whatever they inherit from the parent class. 
(a) Explain how you showed inheritance. 
(b) Separately explain how you showed polymorphism. 
For (a) and (b) two just add comments at the end of your code. 
A comment block can start with /* 
A comment block ends when you type */

	 

	/**
	 * Constructor should initialize number of doors and name of the car.
	 */
	String name;
	String engine;
	public static int wheels =4;
	int numDoors;
	
	//public Car() {}
	public Car(String name, String engine, int numDoors) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.engine = engine;
		this.numDoors =numDoors;
	}
	
	public void startEngine() {
		System.out.println("Engine Started");
	}
	public void brake() {
		System.out.println("Brake!");
	}
	public void accelerate() {
		System.out.println("Accelerating");
	}
	public void stopCar() {
		System.out.println("Engine Stopped");
	}
	public void openTrunk() {
		System.out.println("trunk opened");
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
