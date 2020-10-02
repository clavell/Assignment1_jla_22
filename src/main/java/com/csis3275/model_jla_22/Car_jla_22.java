package com.csis3275.model_jla_22;

@SuppressWarnings("serial")
public class Car_jla_22 extends Vehicle_jla_22 {

	
	/**
	 * fuel in gallons
	 */
	private double fuel = FuelTankSize;
	/**
	 * distance traveled in miles
	 */
	private double mileage = 20;

	public void drive(double tripDistance) {
		fuel -= tripDistance/mileage;
	}
	
	public double refuel(double costOfGas) {
		double totalCost = costOfGas*(FuelTankSize-fuel);
		fuel = FuelTankSize;
		return totalCost;
	}
	
}
