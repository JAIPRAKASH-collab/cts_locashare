package com.example.locashare.dao;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;
import com.example.locashare.entities.Owner;

public interface OwnerDao {
	public List<Owner> getOwners();
	public Owner getOwnerById(int owner_id) throws AccountNotFoundException;
	public Owner addOwner(Owner owner);
    public Owner updateOwner(Owner owner);
    public void deleteOwner(int owner_id);
    public Owner getOwnerByName(String owner_name);
    public Owner getOwnerByLocation(String location);
    
    
}
