package com.sakshi.profileservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakshi.profileservice.entity.UserProfile;
import com.sakshi.profileservice.exception.ProfileNotFoundException;
import com.sakshi.profileservice.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository repository;

	@Override
	public UserProfile addNewCustomerProfile(UserProfile cust) {

		return repository.insert(cust);
	}

	@Override
	public List<UserProfile> getAllProfiles() {

		return repository.findAll();
	}

	@Override
	public UserProfile getByProfileId(int id) {

		return repository.findById(id).orElseThrow(() -> new ProfileNotFoundException("Profile", "id", id));
	}

	@Override
	public String deleteProfile(int id) {
		repository.findById(id).orElseThrow(() -> new ProfileNotFoundException("Profile", "id", id));
		repository.deleteById(id);
		return "Profile Deleted Sucessfully";
	}

	@Override
	public UserProfile updateProfile(int id, UserProfile cust) {
		UserProfile existingUser = repository.findById(id)
				.orElseThrow(() -> new ProfileNotFoundException("Profile", "id", id));

		existingUser.setFullName(cust.getFullName());
		existingUser.setGender(cust.getGender());
		existingUser.setMobileNumber(cust.getMobileNumber());
		existingUser.setPassword(cust.getPassword());
		existingUser.setProfileId(cust.getProfileId());
		existingUser.setEmailId(cust.getEmailId());
		existingUser.setRole(cust.getEmailId());
		existingUser.setAddresses(cust.getAddresses());

		return repository.save(existingUser);
	}

//	@Override
//	public UserProfile addNewMerchantProfile(UserProfile mp) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public UserProfile addNewDeliveryProfile(UserProfile dp) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public UserProfile findByMobileNumber(long mobileNumber) {
//		return repository.findByMobileNumber(mobileNumber);
//	}
//
//	@Override
//	public UserProfile getByUserName(String emailId) {
//		return null;
//	}

}
