package com.csis3275.model_jla_22;

//i'm guessing that without serializable, this won't work
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class Vehicle_jla_22 implements Serializable{
	//looks like we might need this
	private static final long serialVersionUID = 1L;
	private String model;
	private Date manufacturingDate;
	private Date lastMaintenanceDate;
	private String colour;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Date getLastMaintenanceDate() {
		return lastMaintenanceDate;
	}
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setLastMaintenance(Date lastMaintenance) {
		this.lastMaintenanceDate = lastMaintenance;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
}
