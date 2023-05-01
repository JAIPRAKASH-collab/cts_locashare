package com.example.locashare.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.locashare.entities.Rider;

public interface RiderRepo extends JpaRepository<Rider, String> {

}
