package com.example.locashare.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.locashare.entities.Owner;

public interface OwnerRepo extends JpaRepository<Owner,Integer> {



	

	Owner findByOwnerName(String owner_name);



	List<Owner> findByLocation(String location);



}
