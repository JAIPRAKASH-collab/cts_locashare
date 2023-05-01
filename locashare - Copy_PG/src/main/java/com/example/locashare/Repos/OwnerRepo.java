package com.example.locashare.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.locashare.entities.Owner;

public interface OwnerRepo extends JpaRepository<Owner,Integer> {

}
