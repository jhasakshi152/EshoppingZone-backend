package com.sakshi.profileservice.entity;


import java.util.List;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("UserProfile")
public class UserProfile {
	
	@Id
	private int profileId;
	
	//using the validations annotations provided by the bean validation api 
	@NotNull(message = "Name cannot be null")
	@Size(min = 2, message = "First Name should have atleast 2 characters")
	private String fullName;
	
	@NotEmpty(message = "Email cannot be null or empty")
	@Email
	private String emailId;
	
	@NotNull(message = "Mobile Number cannot be null")
	@Size(min = 10, message = "Mobile Number should have 10 characters")
	private Long mobileNumber;
	
	@NotBlank(message = "Gender cannot be null or whitespace")
	private String gender;
	
	@NotBlank(message = "Role cannot be null or whitespace")
	private String role;
	
	@NotEmpty(message = "Password cannot be null or empty")
	@Size(min = 6, message = "Password should have atleast 6 characters")
	private String password;
	
	@NotBlank(message = "Address cannot be null or whitespace")
	private List<Address> addresses;
	
	@Override
	public String toString() {
		return "UserProfile [profileId=" + profileId + ", fullName=" + fullName + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", role=" + role + ", password=" + password
				+ ", addresses=" + addresses + "]";
	}
	
	public UserProfile() {}
	
	public UserProfile(int profileId, String fullName, String image, String emailId, Long mobileNumber,
			 String gender, String role, String password, List<Address> addresses) {
		super();
		this.profileId = profileId;
		this.fullName = fullName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.role = role;
		this.password = password;
		this.addresses = addresses;
	}

	
	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public int hashCode() {
		return Objects.hash(addresses, emailId, fullName, gender, mobileNumber, password,
				profileId, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfile other = (UserProfile) obj;
		return Objects.equals(addresses, other.addresses)
				&& Objects.equals(fullName, other.fullName) && Objects.equals(gender, other.gender)
				&& Objects.equals(mobileNumber, other.mobileNumber)
				&& Objects.equals(password, other.password) && profileId == other.profileId
				&& Objects.equals(role, other.role);
	}
	
		

}
