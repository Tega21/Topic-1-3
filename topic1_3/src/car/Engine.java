package car;

/**
 * 
 * @author Brandon Ortega
 *
 *This Engine class is a representation of the Engine of the car.
 *It cannot be started or stopped.
 */

public class Engine {
	
	private boolean isRunning; // Represents whether engine is on or off
	
	/**
	 * Engine starts
	 */
	public void start() {
		isRunning = true;
	}
	
	/**
	 * Engine stops
	 */
	public void stop() {
		isRunning = false;
	}
	
	/**
	 * Checks to see if engine is on or off
	 * @return True if engine is running, returns flase otherwise
	 */
	public boolean isRunning() {
		return isRunning;
	}

}
