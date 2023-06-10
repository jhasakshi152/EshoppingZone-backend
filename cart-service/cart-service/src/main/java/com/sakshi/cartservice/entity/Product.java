package com.sakshi.cartservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {

	public long productID;
	public String name;
	public String type;
	public String description;
	public double price;
	public double rating;
	public String imageURL;
	
}
