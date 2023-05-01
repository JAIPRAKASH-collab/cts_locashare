package com.example.locashare.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.servlet.Registration;

public interface FindRideRepo extends JpaRepository<Registration, Integer> {

}
