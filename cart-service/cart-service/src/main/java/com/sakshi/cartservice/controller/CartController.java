package com.sakshi.cartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sakshi.cartservice.entity.Cart;
import com.sakshi.cartservice.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	
	@Autowired
	CartService cartService;
	
	//to add the product 
	@PostMapping("/add")
	public void addToCart(@RequestBody Cart cart) {
		cartService.addItemToCartService(cart);
	}
	
	//to delete the product from the cart
	@DeleteMapping("/remove")
	public void removeFromCart(@RequestBody Cart cart) {
		cartService.removeItemFromCart(cart);
	}
	
	//to show particular products by their id
	@GetMapping("/show/{userId}")
	public void showItems(@PathVariable long userId){
	
	cartService.displayAllProductsInCart(userId);
		
	}

}
