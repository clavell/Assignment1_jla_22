package com.csis3275.model_jla_22;
/**
 * 
 * @author Chris Lavell
 * 
 */
public interface VehicleInterface_jla_22 {
	
	/**
	 * Function used to determine if the vehicle needs maintenance
	 */
	public boolean timeForMaintenance();
	/**
	 * 
	 * @return the amount of money it will cost to repair the vehicle
	 */
	public double calculateRepairCosts(); 
}
