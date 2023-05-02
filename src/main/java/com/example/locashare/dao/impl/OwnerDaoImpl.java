package com.example.locashare.dao.impl;
import java.util.*;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.locashare.Repos.OwnerRepo;
import com.example.locashare.dao.OwnerDao;
import com.example.locashare.entities.Owner;

@Service
public abstract class OwnerDaoImpl implements OwnerDao{
	
	@Autowired
	private OwnerRepo ownerRepository;
	/*
	 * @Override public List<Owner> getOwner(){ return repository.findAll(); }
	 */
	  public Owner getOwnerById(int owner_id) throws AccountNotFoundException{ 
		  Owner own = null;
	      if(ownerRepository.findById(owner_id).isEmpty()){
	    	  throw new AccountNotFoundException(); 
	    	  } 
	      return own; 
	      }
	 
	      
	      public List<Owner> getOwners() {
	        return ownerRepository.findAll();
	      }
	
	      public Owner getOwnerById(Integer id) {
	        return ownerRepository.findById(id).orElse(null);
	      }


	      public Owner addOwner(Owner owner) {
	        return ownerRepository.save(owner);
	      }

	      public Owner updateOwner(Owner owner) {
	        return ownerRepository.save(owner);
	      }

	      public void deleteOwnerById(Integer id) {
	        ownerRepository.deleteById(id);
	      }

	      public Owner getOwnerByName(String owner_name) {
	        return ownerRepository.findByOwnerName(owner_name);
	      }

	     
	      public List<Owner> getOwnersByLocation(String location) {
	        return ownerRepository.findByLocation(location);
	      }
	    	
}