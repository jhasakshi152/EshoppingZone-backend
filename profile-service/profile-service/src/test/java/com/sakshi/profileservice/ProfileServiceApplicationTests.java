package com.sakshi.profileservice;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sakshi.profileservice.controller.ProfileResource;
import com.sakshi.profileservice.entity.Address;
import com.sakshi.profileservice.entity.UserProfile;
import com.sakshi.profileservice.repository.ProfileRepository;
import com.sakshi.profileservice.service.ProfileService;

@SpringBootTest
class ProfileServiceApplicationTests {

	@InjectMocks
	ProfileResource profileResource;

	@Mock
	private ProfileService profileService;
	
	@MockBean
	private ProfileRepository profileRepository;
	
//	@Test
//	@Order(1)
//	public void addNewCustomerProfile() {
//		UserProfile custProfile=new UserProfile(123, "Sakshi", "img", "sakshi@gmail.com",123456789,
//				 "Female", "User", "12345",Address);
//	}

}
