package racecars;

import car.Engine;
import car.Tire;

/**
 * 
 * @author Brandon Ortega
 *
 *This RaceCar class represents the actual racing car.
 *This racing car has an engine that can start and stop, it has 4 tires,
 *and can be run at a certain speed.
 *It is currently running
 */

public class RaceCar {
	
	// Engine of the car
	private Engine engine;
	
	// Using an array to represent 4 tires on the RaceCar
	private Tire[] tires;
	
	// Representing the speed the RaceCar is going at
	private int speed;
	
	/**
	 * Constructor for this class. Initializes the engine and tires
	 */
	public RaceCar() {
		engine = new Engine();
		tires = new Tire[4];
		for (int i = 0; i < 4; i++) {
			tires[i] = new Tire(32); // Default tire pressure
		}
	}
	
	/**
	 * Starts the car and checks to see of all 4 tires have at least 32 psi.
	 */
	public void start() {
		for (int i = 0; i < tires.length; i++) {
			if (!tires[i].isGoodPsi()) {
				System.out.println("Cannot start the car. All tires must have at least 32 psi!");
				return;
			}
		}
		engine.start();
		System.out.println("Car started!");
	}
	
	/**
	 * Runs the RaceCar at a given speed. Speed needs to be between 1 and 60 mph.
	 * @param mph The speed of the RaceCar.
	 */
	public void run(int mph) {
		if(!engine.isRunning()) {
			System.out.println("Car is not started!");
			return;
		}
		if(mph < 1 || mph > 60) {
			System.out.println("Invalid speed! Speed must be between 1 and 60 mph.");
			return;
		}
		speed = mph;
		System.out.println("Car is running at " + speed + " mph.");
	}
	
	/**
	 * Stops the RaceCar
	 */
	public void stop() {
		speed = 0;
		engine.stop();
		System.out.println("The RaceCar has stopped!");
	}
	
	/**
	 * Restarts the RaceCar. It will be stopped first and the started again.
	 */
	public void restart() {
		stop();
		start();
	}
	

}
