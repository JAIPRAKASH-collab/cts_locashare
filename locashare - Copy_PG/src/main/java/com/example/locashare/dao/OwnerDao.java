package com.example.locashare.dao;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import com.example.locashare.entities.Owner;

public interface OwnerDao {
	public List<Owner> getOwner();
	public Owner getOwnerById(int owner_id) throws AccountNotFoundException;
	public Owner addOwner(Owner owner) throws OwnerAlreadyExistsException;
    public Owner updateOwner(Owner owner);
    public void deleteOwner(int owner_id);
}
