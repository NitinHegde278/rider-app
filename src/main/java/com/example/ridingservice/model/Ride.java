package com.example.ridingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Ride {
    @Id
    @Column(name = "ride_id")
    private String rideId;
    @Column(name = "ride_name")
    private String rideName;
    @Column(name = "thrillig_factor")
    private Integer thrillingFactor;
    @Column(name = "vomit_factor")
    private Integer vomitFactor;
	public Ride() {
	}
	public Ride(String rideId, String rideName, Integer thrillingFactor, Integer vomitFactor) {
		
		this.rideId = rideId;
		this.rideName = rideName;
		this.thrillingFactor = thrillingFactor;
		this.vomitFactor = vomitFactor;
	}
	public String getRideId() {
		return rideId;
	}
	public void setRideId(String rideId) {
		this.rideId = rideId;
	}
	public String getRideName() {
		return rideName;
	}
	public void setRideName(String rideName) {
		this.rideName = rideName;
	}
	public Integer getThrillingFactor() {
		return thrillingFactor;
	}
	public void setThrillingFactor(Integer thrillingFactor) {
		this.thrillingFactor = thrillingFactor;
	}
	public Integer getVomitFactor() {
		return vomitFactor;
	}
	public void setVomitFactor(Integer vomitFactor) {
		this.vomitFactor = vomitFactor;
	}
    
    
}
