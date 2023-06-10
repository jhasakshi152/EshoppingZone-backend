package com.sakshi.profileservice.service;

import java.util.List;
import java.util.Optional;

import com.sakshi.profileservice.entity.UserProfile;

public interface ProfileService {
	
	public UserProfile addNewCustomerProfile(UserProfile cust);
	public List<UserProfile> getAllProfiles();
	public UserProfile getByProfileId(int id);
	public UserProfile updateProfile(int id,UserProfile cust);
//	public UserProfile addNewMerchantProfile(UserProfile merch);
//	public UserProfile addNewDeliveryProfile(UserProfile deli);
//	public UserProfile findByMobileNumber(long mobileNumber);
//	public UserProfile getByUserName(String email);
	public String deleteProfile(int id);
	
	
	

}
