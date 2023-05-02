package com.example.locashare.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "find_rider")
public class FindRider {
	
	@Id
	@Column (name= "rider_id", nullable = false)
	public int RiderId;
	
	@Column (name = "vehicle_type", nullable = false)
	public int vehicleType;
	
	@Column (name = "from_place", nullable = false)
	public String from;
	
	@Column (name = "to_place", nullable = false)
	public String to;
	
	@Column (name = "start_time", nullable = false)
	public int startTime;
	
	@Column (name = "end_time", nullable = false)
	public int endTime;
	
	@Column (name = "company", nullable = false)
	public String company;
	
	/*
	 * @Column (name = "start") public String pickup;
	 * 
	 * @Column (name = "destination") public String drop;
	 * 
	 * @Column ( name = "arrival_time") public int pickupTime ;
	 * 
	 * @Column (name = "departure_time") public int DropTime;
	 * 
	 * @Column (name = "rider_company", nullable = false) public String company;
	 */
	
	
}
