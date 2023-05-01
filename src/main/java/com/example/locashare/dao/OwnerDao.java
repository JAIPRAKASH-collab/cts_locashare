package com.example.locashare.dao;
import java.util.*;

import javax.security.auth.login.AccountNotFoundException;

import com.example.locashare.entities.Owner;

public interface OwnerDao {
	public List<Owner> getOwner();
	public Owner getOwnerById(int owner_id) throws AccountNotFoundException;
	

}
