package com.example.locashare.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.locashare.dao.OwnerDao;
import com.example.locashare.entities.Owner;

@RestController
@RequestMapping("/owner")
public class OwnerController {
	
	//@Autowired
	//ResTemplate restTemplate;
	
	@Autowired
	private OwnerDao ownerDao;
	
	@GetMapping
	public List<Owner> getOwner(){
		return this.ownerDao.getOwner();
	}
	
	/*
	 * @GetMapping public List<Owner> getOwnerById(){ return
	 * this.ownerDao.getOwnerById(); }
	 */

}
