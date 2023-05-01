package com.example.locashare.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FindRide {
	@Id
	int user_id;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTiming() {
		return timing;
	}
	public void setTiming(int timing) {
		this.timing = timing;
	}
	int vehicle_id;
	String location;
	int timing;
	
}
