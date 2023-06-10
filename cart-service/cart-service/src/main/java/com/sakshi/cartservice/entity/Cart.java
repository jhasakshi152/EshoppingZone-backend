package com.sakshi.cartservice.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("CartDetails")
public class Cart {
	
	@Transient
	public static final String SEQUENCE_NAME = "cart_sequence";
	
	@Id
	public long userId;
	public long productID;
	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Cart(long userId, long productID) {
		super();
		this.userId = userId;
		this.productID = productID;
	}


	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getProductID() {
		return productID;
	}
	public void setProductID(long productID) {
		this.productID = productID;
	}
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	
	
}	
	
	