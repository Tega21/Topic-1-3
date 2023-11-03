package game;

import racecars.RaceCar;

/**
 * 
 * @author Brandon Ortega
 *
 *RaceGame class is a driver script to help simulate the race game.
 */

public class RaceGame {
	
	/**
	 * The entry point for the race simulation game.
	 * @param args main method to run simulator
	 */

	public static void main(String[] args) {
		RaceCar raceCar = new RaceCar();
		raceCar.start();
		raceCar.run(50);
		raceCar.stop();
		raceCar.restart();
		raceCar.run(61);
		raceCar.stop();

	}

}
