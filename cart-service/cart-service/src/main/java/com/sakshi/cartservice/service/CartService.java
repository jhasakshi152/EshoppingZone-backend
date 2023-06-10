package com.sakshi.cartservice.service;

import com.sakshi.cartservice.entity.Cart;


public interface CartService {
	
	void addItemToCartService(Cart cart);
	
	void removeItemFromCart(Cart cart);
	
	void displayAllProductsInCart(long userId);
	
}
