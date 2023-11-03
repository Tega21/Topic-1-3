package car;

/**
 * 
 * @author Brandon Ortega
 *
 *The Tire class helps represent the tires on the car.
 *We need to check the PSI of the tires on the car
 */

public class Tire {
	
	private int psi; // Represents the inflation pressure of tire
	
	/**
	 * Constructor for the tire class
	 * @param psi Initial inflation pressure of tire
	 */
	public Tire(int psi) {
		this.psi = psi;
	}
	
	/**
	 * Increases the PSI of tire
	 * @param psi Amount of psi we need to add
	 */
	public void inflate(int psi) {
		this.psi += psi;
	}
	
	/**
	 * Checks to see if we met the proper psi
	 * @return True if tire's psi is at minimum 32 psi, returns false otherwise
	 */
	public boolean isGoodPsi() {
		return psi >= 32;
	}

}
