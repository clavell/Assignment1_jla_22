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
}