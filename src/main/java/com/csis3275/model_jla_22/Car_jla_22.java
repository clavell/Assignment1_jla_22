package com.csis3275.model_jla_22;

import java.util.Date;

@SuppressWarnings("serial")
public class Car_jla_22 extends Vehicle_jla_22 implements VehicleInterface_jla_22 {

	/**
	 * fuel in gallons
	 */
	private double fuel = FuelTankSize;
	/**
	 * distance traveled in miles
	 */
	private double mileage = 20;

	/**
	 * Function used to determine if the vehicle needs maintenance
	 */
	public boolean timeForMaintenance() {
		Date now = new Date();
		if (now.getTime() - getLastMaintenanceDate().getTime() > 180 * 24 * 60 * 60 * 1000) {
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
		if (timeForMaintenance()) {
			cost += 200;
		}
		if (getProblem() != null) {
			switch (getProblem()) {
			case flatTire:
				cost += 20;
				break;
			case scratchedPaint:
				cost += 300;
				break;
			case brokenEngine:
				cost += 1000;
				break;
			default:
				break;
			}
		}
		return cost;
	}

	public void drive(double tripDistance) {
		fuel -= tripDistance / mileage;
	}

	public double refuel(double costOfGas) {
		double totalCost = costOfGas * (FuelTankSize - fuel);
		fuel = FuelTankSize;
		return totalCost;
	}

}
