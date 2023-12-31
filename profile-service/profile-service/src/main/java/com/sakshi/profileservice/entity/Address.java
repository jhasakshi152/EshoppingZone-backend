package com.sakshi.profileservice.entity;

import java.util.Objects;

public class Address {
	
	private int houseNumber;
	private String colonyName;
	private String city;
	private String state;
	private int pincode;
	//private int profileId;  //to check the particular address belongs to which user
	
	public Address() {
		
	}	
	public Address(int houseNumber, String streetName, String colonyName, String city, String state, int pincode) {
		super();
		this.houseNumber = houseNumber;
		this.colonyName = colonyName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", colonyName=" + colonyName + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String getColonyName() {
		return colonyName;
	}
	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, colonyName, houseNumber, pincode, state);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(colonyName, other.colonyName)
				&& houseNumber == other.houseNumber && pincode == other.pincode && Objects.equals(state, other.state);
	}

	
	
	
}
