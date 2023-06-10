package com.sakshi.profileservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakshi.profileservice.entity.UserProfile;
import com.sakshi.profileservice.exception.ProfileNotFoundException;
import com.sakshi.profileservice.service.ProfileService;

@RestController
@RequestMapping("/user")
public class ProfileResource {

	@Autowired
	ProfileService profileService;
    
    //to add customer
	@PostMapping("/customer/add")
	public UserProfile addNewCustomerProfile(@Valid @RequestBody UserProfile cust) {
		return profileService.addNewCustomerProfile(cust);
	}

    //to show all the profiles of customer
	@GetMapping("/allprofiles")
	public List<UserProfile> getAllProfiles() {
		return profileService.getAllProfiles();
	}

	//to show particular profile by passing the particular id
	@GetMapping("/byprofileid/{id}")
	public UserProfile getByProfileId(@PathVariable int id) {
		return profileService.getByProfileId(id);
	}


    //to update a particular profile by their id
	@PutMapping("/update/{id}")
	public UserProfile updateProfile(@RequestBody UserProfile cust, @PathVariable int id) {
		return profileService.updateProfile(id, cust);
	}
  
	//to delete particular profile by the id
	@DeleteMapping("/delete/{id}")
	public String deleteProfile(@PathVariable int id) {
		return profileService.deleteProfile(id);
	}

}
