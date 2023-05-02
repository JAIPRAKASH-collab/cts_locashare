package com.example.locashare.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table (name = "find_pillion_rider")
public class FindPillionRider {
	
	@Id
	@Column (name= "owner_id")
	public int RiderId;
	
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

}
