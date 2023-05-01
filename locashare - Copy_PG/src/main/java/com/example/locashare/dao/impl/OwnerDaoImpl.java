package com.example.locashare.dao.impl;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.locashare.Repos.OwnerRepo;
import com.example.locashare.dao.OwnerDao;
import com.example.locashare.entities.Owner;

@Service
public class OwnerDaoImpl implements OwnerDao{
	
	@Autowired
	private OwnerRepo repository;
	
	@Override
	public List<Owner> getOwner(){
		return repository.findAll();	
	}
	
	@Override
	public Owner getOwnerById(int owner_id) throws AccountNotFoundException {
		Owner own = null;
		if(repository.findById(owner_id).isEmpty()){
			throw new AccountNotFoundException(); 
		}
		return own;
	}
}