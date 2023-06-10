package com.sakshi.productservice.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("ProductDetails")
public class Product {

	@Transient
	public static final String SEQUENCE_NAME = "product_sequence";

	@Id
	public long productID;
	
	@NotNull
	@Size(min = 2, message = "Product Name should have atleast 2 characters")
	public String name;
	
	@NotBlank(message = "Product type cannot be null or whitespace")
	public String type;
	
	@NotBlank(message = "Description cannot be null or whitespace")
	public String description;
	
	@NotNull(message = "Price cannot be null")
	public double price;
	
	@NotNull(message = "Product Ratings cannot be null")
	public double rating;
	
	@NotNull(message = "Product image cannot be null")
	public String imageURL;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long productID, String name, String type, String description, double price, double rating,
			String imageURL) {
		super();
		this.productID = productID;
		this.name = name;
		this.type = type;
		this.description = description;
		this.price = price;
		this.rating = rating;
		this.imageURL = imageURL;
	}

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

}
