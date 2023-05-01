package com.example.locashare.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "owner_id")
int ownerId;
	
	@Column(name = "owner_name", nullable = false)
String ownerName;
	@Column(name = "license_no", nullable = false)
String licenseNo;
	@Column (name = "vehicle_type", nullable = false)
int vehicleType;
	@Column (name = "from", nullable = false)
String from;
	@Column (name = "to", nullable = false)
String to;
	@Column (name = "pickup_time", nullable = false)
int pickupTime;
	@Column (name = "drop_time", nullable = false)
int dropTime;
}
