package com.csis3275.model_jla_22;

//i'm guessing that without serializable, this won't work
import java.io.Serializable;
import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;


public class Vehicle_jla_22 implements Serializable, Constants{
	
	//looks like we might need this
	private static final long serialVersionUID = 1L;
	private Date lastMaintenanceDate;
	private Problems problem;
	private double tripDistance;
		
	
	
	/**
	 * @return the lastMaintenanceDate
	 */
	public Date getLastMaintenanceDate() {
		return lastMaintenanceDate;
	}
	/**
	 * @param lastMaintenanceDate the lastMaintenanceDate to set
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setLastMaintenanceDate(Date lastMaintenanceDate) {
		
		this.lastMaintenanceDate = lastMaintenanceDate;
	}
	/**
	 * @return the problem
	 */
	public Problems getProblem() {
		return problem;
	}
	
	public String problemToString() {
		return problem.toString();
	}
	/**
	 * @param problem the problem to set
	 */
	public void setProblem(String problem) {
		switch(problem) {
		case "brokenEngine":
			this.problem = Problems.brokenEngine;
		break;
		case "scratchedPaint":
			this.problem = Problems.scratchedPaint;
			break;
		case "flatTire":
			this.problem = Problems.flatTire;
			break;
		}
	}
	public double getTripDistance() {
		return tripDistance;
	}
	public void setTripDistance(double tripDistance) {
		this.tripDistance = tripDistance;
	}
}