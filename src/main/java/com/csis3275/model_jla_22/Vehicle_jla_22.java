package com.csis3275.model_jla_22;

//i'm guessing that without serializable, this won't work
import java.io.Serializable;
import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;


public class Vehicle_jla_22 implements Serializable, Constants{
	
	//looks like we might need this
	private static final long serialVersionUID = 1L;
	private Date purchaseDate;
	private Date lastMaintenanceDate;
	private Problems problem;
		
	
	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
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
	/**
	 * @param problem the problem to set
	 */
	public void setProblem(Problems problem) {
		this.problem = problem;
	}
	
	
//	p
//	/**
//	 * overallDanger level sets probabilities of mishaps in a general sense scale of 0-1
//	 */
//	private double overallDangerLevel = 0.5;
//	
//	protected Map<HowItHappened, Problems> problems;
//	protected HowItHappened[] howItHappened;
//	
//	protected Problems[] possibleProblems;
//	protected Map<Problems, Double> chanceOfMishap;
//	
//	public String getModel() {
//		return model;
//	}
//	public void setModel(String model) {
//		this.model = model;
//	}
//	public Date getPurchaseDate() {
//		return purchaseDate;
//	}
//	
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	public void setPurchaseDate(Date manufacturingDate) {
//		this.purchaseDate = manufacturingDate;
//	}
//	public Date getLastMaintenanceDate() {
//		return lastMaintenanceDate;
//	}
//	
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	public void setLastMaintenance(Date lastMaintenance) {
//		this.lastMaintenanceDate = lastMaintenance;
//	}
//	public String getColour() {
//		return colour;
//	}
//	public void setColour(String colour) {
//		this.colour = colour;
//	}
//	
//	public Problems[] getPossibleProblems() {
//		return possibleProblems;
//	}
//	public void setPossibleProblems(Problems[] possibleProblems) {
//		this.possibleProblems = possibleProblems;
//	}
//	public HowItHappened[] getHowItHappened() {
//		return howItHappened;
//	}
//	public void setHowItHappened(HowItHappened[] howItHappened) {
//		this.howItHappened = howItHappened;
//	}
//	public double getOverallDangerLevel() {
//		return overallDangerLevel;
//	}
//	public void setOverallDangerLevel(double overallDangerLevel) {
//		this.overallDangerLevel = overallDangerLevel;
//	}
	
	
}
