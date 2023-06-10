package com.sakshi.profileservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sakshi.profileservice.entity.UserProfile;

public interface ProfileRepository extends MongoRepository<UserProfile, Integer> {
	
//	UserProfile findByMobileNumber(long mobileNumber);
//	UserProfile findByEmail(String email);

}
