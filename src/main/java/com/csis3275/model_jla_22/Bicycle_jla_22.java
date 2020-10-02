package com.csis3275.model_jla_22;

@SuppressWarnings("serial")
public class Bicycle_jla_22 extends Vehicle_jla_22 {
	/**
	 * difficulty scale of 1-10 how likely you are to fall off the bike
	 */
	private int difficulty = 1;
	private Trick trick;

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
