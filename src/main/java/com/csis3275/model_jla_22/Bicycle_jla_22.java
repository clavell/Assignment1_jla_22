package com.csis3275.model_jla_22;

@SuppressWarnings("serial")
public class Bicycle_jla_22 extends Vehicle_jla_22 implements VehicleInterface_jla_22 {
	/**
	 * difficulty scale of 1-10 how likely you are to fall off the bike
	 */
	private int difficulty = 1;
	private Trick trick;

	/**
	 * Function used to determine if the vehicle needs maintenance
	 */
	public boolean timeForMaintenance() {
		if (getProblem() != null) {
			return true;

		}
		return false;
	}

	/**
	 * 
	 * @return the amount of money it will cost to repair the vehicle
	 */
	public double calculateRepairCosts() {
		double cost = 0;
		if (timeForMaintenance())
			cost += 50.0;

		if (getProblem() != null) {
			switch (getProblem()) {
				case scratchedPaint:
					cost += 100;
					break;
				case squeekyChain:
					cost += 10;
					break;
				default:
					break;
			}
		}
		return cost;
	}

	public void doATrick() {

		double dice = Math.random();
		if (dice > 0.66) {
			difficulty = 3;
			trick = Trick.wheelie;
		} else if (dice > 0.33) {
			difficulty = 9;
			trick = Trick.backflip;
		} else {

			trick = Trick.barSpin;
		}
	}

	/**
	 * 
	 * @return whether or not you fell off your bike
	 */
	public boolean fallOff() {
		double dice = Math.random();
		if (dice < difficulty / 10.0) {
			return true;
		}
		return false;
	}

	/**
	 * @return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}

	/**
	 * @return the trick
	 */
	public Trick getTrick() {
		return trick;
	}

}
