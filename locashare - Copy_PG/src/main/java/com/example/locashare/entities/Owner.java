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
@Table(name="owner")
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "owner_id")
    public int ownerId;
	
	@Column(name = "owner_name", nullable = false)
	public String ownerName;
	@Column(name = "license_no", nullable = false)
	public String licenseNo;
	@Column (name = "vehicle_type", nullable = false)
	public int vehicleType;
	@Column (name = "from", nullable = false)
	public String from;
	@Column (name = "to", nullable = false)
	public String to;
	@Column (name = "pickup_time", nullable = false)
	public int pickupTime;
	@Column (name = "drop_time", nullable = false)
	public int dropTime;
	@Column (name = "company", nullable = false)
	public String company;
}
